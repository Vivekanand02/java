package register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regForm")
public class Register extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String myName = req.getParameter("name1");
		String myPass = req.getParameter("pass1");
		String myEmail = req.getParameter("email1");
		String myGender = req.getParameter("gender1");
		String myCity = req.getParameter("city1");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
			PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?,?)");
			ps.setString(1, myName);
			ps.setString(2, myPass);
			ps.setString(3, myEmail);
			ps.setString(4, myGender);
			ps.setString(5, myCity);

			int count = ps.executeUpdate();
			if (count > 0) {
				out.println("<h3 style='color:green'>Registration Successful</h3>");
			} else {
				out.println("<h3 style='color:red'>Registration Failed</h3>");
			}
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);

		} catch (Exception e) {
			e.printStackTrace();

			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
	}
}
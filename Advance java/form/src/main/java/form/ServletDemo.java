package form;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class ServletDemo extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");

		if (uname.equals("vivi") && pass.equals("vi")) {
			HttpSession session = req.getSession();
			session.setAttribute("username", uname);
			res.sendRedirect("profile.jsp");
		} else {
			res.sendRedirect("login.jsp");
		}
	}
}

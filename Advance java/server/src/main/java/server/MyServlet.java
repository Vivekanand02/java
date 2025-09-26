package server;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class MyServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String email = (String) request.getParameter("email");
		String pass = (String) request.getParameter("password");
		if (email.equals("v@gmail.com") && pass.equals("vivi")) {
			System.out.println("Done");
		} else {
			System.out.println("failed");
		}
		System.out.println("successfull");
	}
}

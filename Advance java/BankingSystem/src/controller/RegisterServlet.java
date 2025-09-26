package controller;

import java.io.IOException;

import dao.UserDAO;
import model.User;
import util.PasswordUtil;

public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = PasswordUtil.hashPassword(request.getParameter("password"));

		User user = new User(name, email, mobile, password);

		boolean isRegistered = UserDAO.registerUser(user);

		if (isRegistered) {
			response.sendRedirect("login.jsp?msg=registered");
		} else {
			response.sendRedirect("register.jsp?msg=failed");
		}
	}
}

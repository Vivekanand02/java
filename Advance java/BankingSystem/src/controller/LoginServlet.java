package controller;

import java.io.IOException;

import dao.UserDAO;
import model.User;
import util.PasswordUtil;

public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = PasswordUtil.hashPassword(request.getParameter("password"));

		User user = UserDAO.login(email, password);

		if (user != null && "approved".equals(UserDAO.getStatus(email))) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("dashboard.jsp");
		} else {
			response.sendRedirect("login.jsp?msg=failed");
		}
	}
}

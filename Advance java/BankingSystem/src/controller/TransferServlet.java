package controller;

import java.io.IOException;

import dao.AccountDAO;
import model.User;

public class TransferServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");

		if (user == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		String fromEmail = user.getEmail();
		String toEmail = request.getParameter("toEmail");
		double amount = Double.parseDouble(request.getParameter("amount"));

		boolean result = AccountDAO.transferAmount(fromEmail, toEmail, amount);

		if (result) {
			response.sendRedirect("transfer.jsp?msg=success");
		} else {
			response.sendRedirect("transfer.jsp?msg=fail");
		}
	}
}

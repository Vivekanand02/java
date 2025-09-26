package controller;

import java.io.IOException;
import java.util.List;

import dao.AccountDAO;
import model.Transaction;
import model.User;

public class TransactionHistoryServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");

		if (user == null) {
			response.sendRedirect("login.jsp");
			return;
		}

		List<Transaction> history = AccountDAO.getTransactionHistory(user.getEmail());
		request.setAttribute("history", history);
		RequestDispatcher dispatcher = request.getRequestDispatcher("transaction.jsp");
		dispatcher.forward(request, response);
	}
}

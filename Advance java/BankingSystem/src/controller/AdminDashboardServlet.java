package controller;

import java.io.IOException;
import java.util.List;

import dao.AccountDAO;
import dao.UserDAO;
import model.Transaction;
import model.User;

@WebServlet("/admin-dashboard") // Add a specific URL pattern if you like
public class AdminDashboardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");

		// Redirect to login if the user is not logged in or is not an admin
		if (user == null || !user.getRole().equals("admin")) {
			response.sendRedirect("login.jsp");
			return;
		}

		// Fetch all users and transactions from the database
		List<User> users = UserDAO.getAllUsers();
		List<Transaction> transactions = AccountDAO.getAllTransactions();

		// Set the users and transactions as request attributes to forward them to the
		// JSP
		request.setAttribute("users", users);
		request.setAttribute("transactions", transactions);

		// Forward to admin dashboard JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin_dashboard.jsp");
		dispatcher.forward(request, response);
	}
}

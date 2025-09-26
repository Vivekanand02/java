package todo;

import java.io.IOException;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ToDoServlet")
public class ToDoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		ToDoList todoList = (ToDoList) session.getAttribute("todoList");

		if (todoList == null) {
			todoList = new ToDoList();
			session.setAttribute("todoList", todoList);
		}

		String action = request.getParameter("action");

		if ("add".equals(action)) {
			String title = request.getParameter("title");
			String description = request.getParameter("description");
			String dueDateStr = request.getParameter("dueDate");
			String priorityStr = request.getParameter("priority");

			if (title != null && dueDateStr != null && priorityStr != null) {
				LocalDate dueDate = LocalDate.parse(dueDateStr);
				Priority priority = Priority.valueOf(priorityStr);
				todoList.addTask(new Task(title, description, dueDate, priority));
			}
		} else if ("remove".equals(action)) {
			String title = request.getParameter("title");
			todoList.removeTask(title);
		} else if ("complete".equals(action)) {
			String title = request.getParameter("title");
			todoList.markTaskAsCompleted(title);
		}

		response.sendRedirect("index.jsp");
	}
}

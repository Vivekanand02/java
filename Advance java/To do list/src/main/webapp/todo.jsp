<%@ page import="todo.Task, todo.ToDoList, todo.Priority, java.util.List, java.time.LocalDate" %>
<%
    ToDoList todoList = (ToDoList) session.getAttribute("todoList");
    if (todoList == null) {
        todoList = new ToDoList();
        session.setAttribute("todoList", todoList);
    }

    List<Task> tasks = todoList.getTasks();
%>

<% for (Task task : tasks) { %>
    <div class="task <%= task.isCompleted() ? "completed" : "" %>">
        <strong><%= task.getTitle() %></strong> - <%= task.getDescription() %> 
        (Due: <%= task.getDueDate() %>, Priority: <%= task.getPriority() %>)

        <form method="post" style="display:inline;">
            <input type="hidden" name="action" value="complete">
            <input type="hidden" name="title" value="<%= task.getTitle() %>">
            <button type="submit">Mark Completed</button>
        </form>

        <form method="post" style="display:inline;">
            <input type="hidden" name="action" value="remove">
            <input type="hidden" name="title" value="<%= task.getTitle() %>">
            <button type="submit">Remove</button>
        </form>
    </div>
<% } %>

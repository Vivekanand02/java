package todo;

import java.time.LocalDate;

public class Task {
	private String title;
	private String description;
	private LocalDate dueDate;
	private boolean isCompleted;
	private Priority priority;

	public Task(String title, String description, LocalDate dueDate, Priority priority) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.isCompleted = false;
	}

	public void markAsCompleted() {
		isCompleted = true;
	}

	public void updateTask(String title, String description, LocalDate dueDate, Priority priority) {
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	@Override
	public String toString() {
		return title + " | Due: " + dueDate + " | Priority: " + priority + " | Completed: " + isCompleted;
	}

}

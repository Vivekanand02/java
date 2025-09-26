package todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
	private List<Task> tasks;

	public ToDoList() {
		this.tasks = new ArrayList<>();
	}

	public void addTask(Task task) {
		if (task != null && task.getTitle() != null) {
			tasks.add(task);
		}
	}

	public void removeTask(String title) {
		if (title != null) {
			tasks.removeIf(task -> task != null && task.getTitle() != null && task.getTitle().equalsIgnoreCase(title));
		}
	}

	public void markTaskAsCompleted(String title) {
		if (title != null) {
			for (Task task : tasks) {
				if (task != null && task.getTitle() != null && task.getTitle().equalsIgnoreCase(title)) {
					task.markAsCompleted();
					break;
				}
			}
		}
	}

	public List<Task> getTasks() {
		return tasks;
	}
}

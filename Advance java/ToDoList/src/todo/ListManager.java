package todo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListManager {
	List<Task> tasks = new ArrayList<>();
	private int taskCounter = 1;

	public void addTask(String description) {
		Task newTask = new Task(taskCounter++, description);
		tasks.add(newTask);
		System.out.println("task Added : " + description);
	}

	public void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available.");
			return;
		}
		for (Task task : tasks) {
			task.displayTaskDetails();
		}
	}

	public void markTaskAsCompleted(int taskId) {
		for (Task task : tasks) {
			if (task.getTaskId() == taskId) {
				task.completedTask();
				System.out.println("task " + taskId + " marked as completed.");
				return;
			}
		}
		System.out.println("TaskId not found.");
	}

	public void removeTask(int taskId) {
		Iterator<Task> iterator = tasks.iterator();
		while (iterator.hasNext()) {
			Task task = iterator.next();
			if (task.getTaskId() == taskId) {
				iterator.remove();
				System.out.println("Task " + taskId + " removed.");
				return;
			}
		}
		System.out.println("Task ID not found.");
	}
}

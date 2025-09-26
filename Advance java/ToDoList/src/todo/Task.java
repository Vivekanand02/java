package todo;

public class Task {
	private Integer taskId;
	private String description;
	private boolean status;

	public Task(Integer taskId, String description) {
		this.taskId = taskId;
		this.description = description;
		this.status = true;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public String getDescription() {
		return description;
	}

	public boolean getStatus() {
		return status;
	}

	public void completedTask() {
		status = false;
	}

	public void displayTaskDetails() {
		String statusText = status ? "Pending" : "Completed";
		System.out.println(taskId + " " + description + " " + statusText);
	}
}

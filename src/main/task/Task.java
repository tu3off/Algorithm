package main.task;

public abstract class Task {
	
	private final int numberOfTask;
	
	public Task(int numberOfTask) {
		this.numberOfTask = numberOfTask;
	}

	public abstract void execute();
	
	protected void printResult(String inputText, String outputText) {
		System.out.println("Task #" + numberOfTask);
		System.out.println("=================================");
		System.out.println("Input: " + inputText + "\n");
		System.out.println("Output: " + outputText);
		System.out.println("=================================");
	}
	
}

package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.task.SimpleTaskFabric;
import main.task.Task;

public class Runner {
	
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		Task task = SimpleTaskFabric.getInstance(readNumberOfTask());
		task.execute();
		run();
	}
	
	private static int readNumberOfTask() {
		final BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Enter number of task:");
		int i;
		try {
			i = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Invalid input type " + e.getLocalizedMessage());
			return readNumberOfTask();
		}
		return i;
	}

}

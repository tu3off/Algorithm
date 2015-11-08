package main.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class TaskTwo extends Task {
	
	private static final int NUMBER_OF_TASK = 2;
	
	private final List<Integer> stack; 
	private final int[] array;
	
	TaskTwo(int[] array) {
		super(NUMBER_OF_TASK);
		stack = new ArrayList<>();
		putToStack();
		this.array = array;
	}
	
	private void putToStack() {
		for(int i = 1; i < 101; i ++) {
			stack.add(i);
		}
	}

	@Override
	public void execute() {
		final int length = array.length;
		for(int i = 0; i < length; i ++) {
			stack.remove((Integer) array[i]);
		}
		printResult(Arrays.toString(array), String.valueOf(stack.get(0)));
	}


}

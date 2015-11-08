package main.task;

public class SimpleTaskFabric {
	
	private static final int ONE = 1;
	private static final int TWO = 2;
	
	private static final String TASK_ONE_INPUT_TEXT = "adddaaaaaaaas";
	
	// The number 3 is absent
	private static final int[] TASK_TWO_INPUT_ARRAY = {
			1, 2, 4, 4, 5, 6, 7, 8, 9 ,10,
			11, 12, 13, 14, 15, 16, 17, 18, 19 ,20,
			21, 22, 23, 24, 25, 26, 27, 28, 29 ,30,
			31, 32, 33, 34, 35, 36, 37, 38, 39 ,40,
			41, 42, 43, 44, 45, 46, 47, 48, 49 ,50,
			51, 52, 53, 54, 55, 56, 57, 58, 59 ,60,
			61, 62, 63, 64, 65, 66, 67, 68, 69 ,70,
			71, 72, 73, 74, 75, 76, 77, 78, 79 ,80,
			81, 82, 83, 84, 85, 86, 87, 88, 89 ,90,
			91, 92, 93, 94, 95, 96, 97, 98, 99 ,100};
	
	public static Task getInstance(int taskId) {
		switch (taskId) {
		case ONE:
			return new TaskOne(TASK_ONE_INPUT_TEXT);
		case TWO:
			return new TaskTwo(TASK_TWO_INPUT_ARRAY);
		default:
			System.out.println("Incorrect number");
			throw new IllegalArgumentException();
		}
	}
	

}

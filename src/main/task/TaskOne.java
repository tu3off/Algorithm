package main.task;

final class TaskOne extends Task {

	private static final int NUMBER_OF_TASK = 1;
	private static final char NULL = '\u0000';
	private final String inputText;
	
	TaskOne(String inputText) {
		super(NUMBER_OF_TASK);
		this.inputText = inputText;
	}

	public void execute() {
		final int length = inputText.length();
		final StringBuilder builder = new StringBuilder();
		char lastSymbol = NULL;
		int count = 0;
		for (int i = 0; i < length; i++) {
			final char symbol = inputText.charAt(i);
			if (lastSymbol == NULL) {
				lastSymbol = symbol;
				count++;
				continue;
			}
			if (lastSymbol != symbol) {
				builder.append(lastSymbol);
				builder.append(count);
				lastSymbol = symbol;
				count = 1;
			} else {
				count++;
			}
		}
		if (count != 0) {
			builder.append(lastSymbol);
			builder.append(count);
		}
		printResult(inputText, builder.toString());
	}

}
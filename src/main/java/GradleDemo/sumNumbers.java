package GradleDemo;

public class sumNumbers {
	public int sum(int a, int b) {
		if (a>20) {
			throw new IllegalArgumentException("Value should be less than 10");
		}
		return a+b;
	}
}

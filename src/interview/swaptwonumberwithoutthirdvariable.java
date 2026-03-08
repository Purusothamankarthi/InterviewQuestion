package interview;

public class swaptwonumberwithoutthirdvariable {
	public static void main(String[] args) {
		int a = 25, b = 33;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print(a + " " + b);

	}
}
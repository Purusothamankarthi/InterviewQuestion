package interview;

public class BalancedParentheses {
	public static void main(String[] args) {
		String parenthese = "(()())";
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < parenthese.length(); i++) {
			if (parenthese.charAt(i) == '(') {
				count++;
			} else if (parenthese.charAt(i) == ')') {
				count--;
			}

			if (count < 0) {
				flag = false;
				break;
			}
		}
		if (count == 0 && flag) {
			System.out.print("Balance");

		} else {
			System.out.print("InBalanace");
		}
	}
}

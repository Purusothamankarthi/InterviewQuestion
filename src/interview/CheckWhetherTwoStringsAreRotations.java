package interview;

public class CheckWhetherTwoStringsAreRotations {
	public static void main(String[] args) {
		String one = "abcd";
		String two = "cdab";
		int count = 0;
		if (one.length() != two.length()) {
			System.out.print("No");
		} else {
			for (int i = 0; i < one.length(); i++) {
				char ch = one.charAt(i);
				for (int j = 0; j < two.length(); j++) {
					char ch1 = two.charAt(j);
					if (ch == ch1) {
						count++;
					}
				}
			}
		}
		if (count == one.length()) {
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
	}
}

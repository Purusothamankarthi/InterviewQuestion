package interview;

public class CountWordsEndingWithVowel {
	public static void main(String[] args) {
		String words = "Java is easy to learn";
		int count = 0;
		String sp[] = words.split(" ");
		for (int i = 0; i < sp.length; i++) {
			char ch = sp[i].charAt(sp[i].length() - 1);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//			System.out.print(sp[i] +" ");
				count++;
			}
		}
		System.out.print(count);
	}
}

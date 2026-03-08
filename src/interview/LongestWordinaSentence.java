package interview;

public class LongestWordinaSentence {

	public static void main(String[] args) {
		String words = "Java programming is powerful";
		String sp[] = words.split(" ");
		int len = sp[0].length();
		String last="";
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].length() > len) {
				len = sp[i].length();
				last =sp[i];
			}
		}
System.out.print(last);
	}

}

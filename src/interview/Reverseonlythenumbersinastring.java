package interview;

public class Reverseonlythenumbersinastring {

	public static void main(String[] args) {
		String words="ab12cd34";
		String num="";
		for(int i=0;i<words.length();i++) {
			char num1=words.charAt(i);
			if(Character.isDigit(num1)) {
				num+=num1;
			}
		}
		String re="";
		for(int j=num.length()-1;j>=0;j--) {
			re+=num.charAt(j);
		}
		String newwords="";
		int in=0;
		for(int k=0;k<words.length();k++) {
			char word=words.charAt(k);
			if(Character.isDigit(word)) {
				newwords +=re.charAt(in++);
			}
			else {
				newwords +=word;
			}
		}
		System.out.print(newwords);

	}

}

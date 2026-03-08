package interview;

public class withoutreverse {
	public static void main(String[] args) {
		String s="madam";
		String re="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			re+=ch;
		}
		if(s.equals(re))
		{
			System.out.print("Palindrome");
		}
		else
		{
			System.out.print("Not a Palindrome");
		}
	}
}

package interview;

public class Pangram {
	public static void main(String[] args)
	{
		String s="The quick brow fox jumps over the lazy dog";
		s=s.toLowerCase();
		boolean flag=true;
		for(char ch='a';ch<'z';ch++)
		{
			if(s.indexOf(ch)==-1)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.print("pangram");
		}
		else
		{
			System.out.print("not pangram");
		}
	}
}

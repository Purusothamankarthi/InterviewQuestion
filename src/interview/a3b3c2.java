package interview;

public class a3b3c2 {
	public static void main(String[] args)
	{
		String a="aaabbbcc";
		String b="";
		int count=1;
		for(int i=0;i<a.length()-1;i++)
		{
			char ch=a.charAt(i);
			if(ch==a.charAt(i+1))
			{
				count++;
			}
			else
			{
				b=b+ch+count;
				count=1;
			}
			
			
		}
		 b = b + a.charAt(a.length() - 1) + count;
		System.out.print(b);
	}
}

package interview;
import java .util.*;
public class palindrome {
		public static void main(String[]  args)
		{
		Scanner  scan= new Scanner(System.in);
		String name = scan.next();
																/* ARRAY AND SPLIT */
		String[] split=name.split("");
		String joined = ""; 
		int j=0;
		String[] join=new String[split.length];
		for(int i=split.length-1;i>=0;i--)
		{
			join[j]=split[i];
			j++;
		}
		joined=String.join("", join);
		if(name.equals(joined))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
																	/*	STRINGBULIDER */
		StringBuilder sb=new StringBuilder(name);
		sb.reverse();
		String re=new String(sb);
		if(name.equals(re))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("No");
			}
		}
}
package interview;

public class firstnonrepeatingletter {
	public static void main(String[] args)
	{
		String s="leetcode";
		for(int i=0;i<s.length();i++)
		{
			int flag=0;
			
			for(int j=i+1;j<s.length();j++)
			{
				 if(i != j && s.charAt(i) == s.charAt(j))
	                {
	                    flag = 1; // repeating found
	                    break;
	                }
	            }

	            if(flag == 0)
	            {
	                System.out.print(s.charAt(i));
	                break;
	            }
		}
		
	}
}

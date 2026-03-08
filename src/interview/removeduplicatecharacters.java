package interview;

public class removeduplicatecharacters {
	public static void main(String[] args)
	{
		String s="banana";
		String rem="";
		for(int i=0;i<s.length();i++)
		{
			boolean flag = false;
			char ch=s.charAt(i);
			for(int j=0;j<i;j++) {
				char ch1=s.charAt(j);
				if(ch1==ch )
				{
					
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				rem+=ch;
			}
			
		}
		System.out.print(rem);
	}
}

package interview;

public class replacewithcount {
	public static void main(String[] args)
	{
		String s="aaabbc";
		String re1="";
		for(int i=0;i<s.length();i++)
		{
			boolean flag=true;
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					flag=false;
					
					break;
				}
			}
			if(flag==true) {
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					
					count++;
					
				}
			}
			
				for(int k=0;k<s.length();k++)
				{
					if(s.charAt(i)==s.charAt(k)) {
						re1=re1+count;
					}
				
			}
		}
		}
		
		System.out.print(re1);
	}
}

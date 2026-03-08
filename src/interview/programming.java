package interview;

public class programming {
	public static void main(String[] args)
	{
		String a="programming";
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<a.length();j++)
			{
				if(ch==a.charAt(j))
				{
					flag=false;
				}
				
			}
		if(flag==true)
		{
			System.out.print(ch);
		}
		}
	}
}

package interview;

public class CheckStrongNumber {
	public static void main(String[] args)
	{
		int num=145;
		int temp=num;
		int add=0;
		while(temp>0)
		{
			int sum=1;
			int b=temp%10;
			for(int i=1;i<=b;i++)
			{
				
				sum*=i;
			}
			temp/=10;
			add+=sum;
			
					
		}
		System.out.println(add);
	}
}

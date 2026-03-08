package interview;

public class prefectnumberonot {
	public static void main(String[] args)
	{
		int num =12;
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if (num % i == 0) {
			
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.print("Perfect Number");
		}
		else
		{
			System.out.print("Not Perfect Number");
		}
	}
}

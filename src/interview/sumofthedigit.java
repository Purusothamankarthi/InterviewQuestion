package interview;

public class sumofthedigit {
	public static void main(String[] args)
	{
		int num=9875;
		while(9<num)
		{
			int sum=0;
			while(num>0)
			{
				
				int m=num%10;
				sum+=m;
				num/=10;
			}
			num=sum;
		}
		System.out.print(num);
	}
}

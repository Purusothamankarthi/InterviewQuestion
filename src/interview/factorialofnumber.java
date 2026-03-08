package interview;

public class factorialofnumber {
	public static void main(String[] args)
	{
		int num=5;
		int sum=1;
		for(int i=1;i<=num;i++)
		{
			sum*=i;
		}
		System.out.print(sum);
	}
}

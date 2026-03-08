package interview;
public class reverseanumberwithoutstring {
	public static void main(String[] args)
	{
		int num=1234;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int b=num%10;
			sum = sum * 10 + b;
			num/=10;
		}
		System.out.print(sum);
	}
}

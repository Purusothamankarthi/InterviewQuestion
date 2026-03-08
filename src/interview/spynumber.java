package interview;

public class spynumber {
	public static void main(String[] args)
	{
		int num=123;
		int temp=num;
//		int tem=num;
		int sum=0,mul=1;
		while(temp>0)
		{
			int b=temp%10;
			sum+=b;
			mul*=b;
			temp/=10;
		}
//		System.out.print(sum);
		if(sum==mul) {
			System.out.print("Spy number");
		}
		else
		{
			System.out.print("Not a Spy number");
		}
	}
}

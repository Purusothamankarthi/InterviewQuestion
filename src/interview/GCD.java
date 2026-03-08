package interview;

public class GCD {
	public static void main(String[] args)
	{
		int a=36,b=60;
		int gcd=0;
		for(int i=1;i<a;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.print(gcd);
	}
}

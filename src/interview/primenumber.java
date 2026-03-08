package interview;

public class primenumber {
	public static void main(String[] args)
	{
		int num=10;
		boolean isPrime=true;
		for(int i=2;i<num/2;i++)
		{
			if (num % i == 0) {
                isPrime = false;
                break;
            }
		}
		if(isPrime)
		{
			System.out.print("Prime");
		}
		else
		{
			System.out.print("Not Prime");
		}
	}
}

package interview;

public class SumofDigits {

	public static void main(String[] args) {
		int number=12345;
		int sum=0;
		while(number!=0)
		{
			int d=number%10;
			sum=sum+d;
			number=number/10;
		}
		System.out.print(sum);
	}

}

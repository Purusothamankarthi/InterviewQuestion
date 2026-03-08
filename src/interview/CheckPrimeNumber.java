package interview;
import java.util.*;
public class CheckPrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		
//		float num=number/2;
//		int sum=(int) num;
		int c=0;
//		System.out.print(sum);
		if(number<=1)
		{
			System.out.print("No");
		}
		else {
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					c=1;
				}
//				System.out.print("s");
			}
		}
		if(c==0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("No");
		}
	}

}

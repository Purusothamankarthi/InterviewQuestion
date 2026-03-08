package interview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153;
		int temp=number;
//		String len=Integer.toString(number);
//		int m=0;
//		while(number!=0)
//		{
//			int dig=number%10;
//			m=m+(dig*len.length())*10;
//			number=number/10;
//		}
//		
//		System.out.print(m);
		int sum=0,len=0;;
		while(temp>0)
		{
			len++;
			temp/=10;
		}
		temp=number;
		while(temp>0)
		{
			int b=temp%10;
			sum=(int) (sum+(Math.pow(b, len)));
			temp/=10;
		}
		if(number==sum)
		{
			System.out.print("Amstrong");
		}
		else
		{
			System.out.print("Not Amstrong");
		}
	}

}

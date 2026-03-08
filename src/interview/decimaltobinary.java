package interview;

public class decimaltobinary {
	public static void main(String[] args) {
		int num=10;
		int binary=0;
		int sum=1;
		while(num>0)
		{
			int rem=num%2;
			binary=binary+rem*sum;
			sum=sum*10;
			num/=2;
		}
		System.out.print(binary);
	}
}

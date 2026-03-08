package interview;

public class countthedigitinanumber {
	public static void main(String[] args)
	{
		int num=12345;
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		System.out.print(len);
	}
}

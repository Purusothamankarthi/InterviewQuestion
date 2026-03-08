package interview;

public class leapyearornot {
	public static void main(String[] args)
	{
		int year=2001;
		if( year%4==0 || year%400==0)
		{
			System.out.print("Leap Year");
		}
		else
		{
			System.out.print("Not A Leap Year");
		}
	}
}

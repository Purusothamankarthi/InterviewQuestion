package interview;

public class ReverseanInteger {

	public static void main(String[] args) {
		int number=12345;
//		String length=Integer.toString(number);
		int reversed = 0;
		for(;number !=0;number/=10)
		{
			int digit = number % 10;
            reversed = reversed * 10 + digit;
		}
		System.out.println(reversed);
		while(number!=0)
		{
			 int digit = number % 10;         
	            reversed = reversed * 10 + digit; 
	            number = number / 10;  
		}
		System.out.print(reversed);
	}

}

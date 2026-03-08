package interview;

public class fibonacciseries {

	public static void main(String[] args) {
		int first=0,second =1,numbers=7;
		System.out.print(first+" "+second);
		
		for(int i=2;i<numbers;i++)
		{
			int next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
		}
		
	}

}

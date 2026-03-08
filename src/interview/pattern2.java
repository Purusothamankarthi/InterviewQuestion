package interview;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=num-1;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

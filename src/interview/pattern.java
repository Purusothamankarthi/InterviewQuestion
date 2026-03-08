package interview;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(" ");
			}
			if(i!=0)System.out.print("*");
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			System.out.print("*");
//			System.out.println();			
		
			
				System.out.println("");	
		}
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int k=num-1;k>i;k--) {
				System.out.print(" ");
			}
			for(int k=num-1;k>i;k--) {
				System.out.print(" ");
			}
			if(i!=4)System.out.println("*");
		}
	}

}

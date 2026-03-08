package interview;

public class consecutivenumber {
	public static void main(String[] args)
	{
		int arr[]= {1,1,0,1,1,1};
		int count=1;int cou=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if( cou==arr[i])
			{
				count++;
			}
			else
			{
				count=1;
				cou=arr[i];
			}
		}
		System.out.print(count+" "+ cou);
	}
}

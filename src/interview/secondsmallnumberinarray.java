package interview;

public class secondsmallnumberinarray {
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,8,6,9,0};
		int first=arr[0],second=first;
		for(int i=0;i<arr.length;i++)
		{
			if(first>arr[i])
			{
				second=first;
				first=arr[i];
			}
		}
		System.out.print(second);
	}
}

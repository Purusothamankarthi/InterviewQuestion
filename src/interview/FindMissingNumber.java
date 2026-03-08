package interview;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args)
	{
		int arr[]= {1, 2, 4, 5};
		Arrays.sort(arr);
		int miss=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i+1]-arr[i]!=1)
			{
				miss=arr[i];
				System.out.print(miss+1);
				break;
			}
		}
	}
}

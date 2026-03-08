package interview;

import java.util.Arrays;

public class zeroslost {
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,0,4,0};
		int arr1[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[index++]=arr[i];
			}
		}
//		
		System.out.print(Arrays.toString(arr1));
	}
}

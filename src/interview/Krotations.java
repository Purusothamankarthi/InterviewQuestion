package interview;

import java.util.Arrays;

public class Krotations {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int k=3;
		int m=k-1;
		int arr1[]=new int[arr.length];
		int index=0;
		for(int i=m;i>=0;i--)
		{
			arr1[index++]=arr[i];
		}
	
		for(int i=k;i<arr.length;i++) {
			arr1[index++]=arr[i];
		}
		System.out.print(Arrays.toString(arr1));

	}

}

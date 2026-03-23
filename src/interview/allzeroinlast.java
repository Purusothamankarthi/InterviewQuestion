package interview;
import java.util.*;
public class allzeroinlast {

	public static void main(String[] args) {
		int arr[]= {1,0,3,0,12};
		int arr1[]=new int[arr.length];
		int b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[b++]=arr[i];
			}
		}
		System.out.print(Arrays.toString(arr1));
	}

}

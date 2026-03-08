package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ultramain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="9988111377";
		String[] arr=a.split("");
		List<String> brr= new ArrayList<>();
		List<String> crr= new ArrayList<>();
		
		int b=0;
//		System.out.print(arr.length);
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
//					b++;
				}
			}
			if(count==2)
			{
//				System.out.print(arr[i]+" ");
				brr.add(arr[i]);
				
			}
			
			else if(count==3)
			{
				crr.add(arr[i]);
			}
		}
//		for(int i=0;i<1;i++)
//			
//		{
//		}
		String[] doubles=brr.toArray(new String[0]);
		String[] three=crr.toArray(new String[0]);
		System.out.print("Double Digits ");
		for(int i=0;i<doubles.length;i++)		
		{
			System.out.print(doubles[i]);
		}
		System.out.print(" ");
		System.out.println();
		System.out.print("Three Digits ");
		for(int i=0;i<three.length;i++)		
		{
			System.out.print(three[i]);
		}
		
//		System.out.println("Three Digits"+ Arrays.toString(three));
//		for(int i=0;i<1;i++)
//			
//		{
//			System.out.print("Three digits "+crr);
////			System.out.println(arr[i]);
//		}
		
	}

}

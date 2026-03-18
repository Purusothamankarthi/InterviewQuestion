package interview;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int max=arr[0];
		int maxse=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < max)
			{
				maxse=max;
				max=arr[i];
			}
		}
		System.out.print(maxse);
	}

}

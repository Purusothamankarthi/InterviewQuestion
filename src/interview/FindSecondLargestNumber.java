package interview;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int max=0;
		int maxse=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				maxse=max;
				max=arr[i];
			}
		}
		System.out.print(maxse);
	}

}

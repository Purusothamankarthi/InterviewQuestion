package interview;

public class secondlargestelementwithoutsorting {
	public static void main(String[] args)
	{
		int arr[]= {10, 45, 23, 89, 89, 12};
		int first=arr[0],second=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>first ) {
				second=first;
				first=arr[i];
			}
			else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
		}
		
		System.out.print(second);
		
	}
}

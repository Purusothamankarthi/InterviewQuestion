package interview;

public class findthelargestandsmallestnumberinarray {
	public static void main(String[] args) {
		int arr[]={10, 5, 80, 25};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
			}
			
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		System.out.print(largest+" "+smallest);
	}
}

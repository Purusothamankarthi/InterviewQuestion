package interview;

public class FindDuplicateElementsinArray {
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,2,4,5,3};
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=true;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=false;
				}
			}
			if(flag==false)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}

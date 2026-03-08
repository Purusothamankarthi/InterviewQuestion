package interview;

public class countoccurrenceofthenumber {
	public static void main(String[] args)
	{
		int arr[]={1, 2, 3, 2, 2, 4}  ;
		int num=2,count=0;;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
			{
				count++;
			}
		}
		System.out.print(count);
	}
}

package interview;

public class consecutive {
	public static void main(String[] args)
	{
		int arr[]= {1,1,0,1,1,1,1};
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
				else 
				{
					break;
				}
				
			}
			if(count>ans)
			{
				
			ans=count;
			}
		}
		System.out.print(ans+"   ");
	}
}

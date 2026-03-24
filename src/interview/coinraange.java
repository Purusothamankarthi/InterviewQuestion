package interview;

public class coinraange {
	public static void main(String[] args)
	{
		int arr[]= {1,5,10};
		int amount=12;
		int am[]=new int[amount+1];
		for(int i=1;i<=amount;i++)
		{
			am[i]=Integer.MAX_VALUE;
//			System.out.print(am[i] + " ");
			
		}
		am[0]=0;	
		for(int i=1;i<=amount;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]<=i && am[i-arr[j]]!=Integer.MAX_VALUE)
				{     
					am[i]=Math.min(am[i], am[i-arr[j]]+1);
					System.out.print(am[i]+" ");
					
				}
			}
		}
		if(am[amount]==Integer.MAX_VALUE)
		{
			System.out.print(-1);
		}
		else
		{
			System.out.print(am[amount]);
		}

	}
}

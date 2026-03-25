package interview;

public class Longcommonperfix {
	public static void main(String[] args)
	{
		String arr[]= {"flower","flow","flight"};
		String first=arr[0];
		for(int i=1;i<arr.length;i++ )
		{
			while(arr[i].indexOf(first)!=0)
			{
				first=first.substring(0,first.length()-1);
			}
		}
		System.out.print(first);
	}
}

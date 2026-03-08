package interview;

public class RemoveDuplicatesfromArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1};
		int[] brr=new int[arr.length-1];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<brr.length;j++)
			{
				if(arr[i]==brr[j])
				{
//					System.out.print("no");
					count=1;
					break;
				}
				
			}
			if(count==0)
			{
				brr[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++)
		{
			System.out.print(brr[i]);
		}
	}

}

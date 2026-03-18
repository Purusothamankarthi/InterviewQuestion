package interview;

public class checkinarray {
	public static void main(String[] args) {
		String s="leetcode";
		String arr[]= {"leet","code"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(s.startsWith(arr[i]))
			{
				String remain=s.substring(arr[i].length());
				for(int j=0;j<arr.length;j++)
				{
					if(remain.equals(arr[j])){
						flag=true;
					}

				}
			}
		}
		System.out.print(flag);
	}
}

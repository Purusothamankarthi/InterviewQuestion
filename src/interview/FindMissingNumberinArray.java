package interview;

public class FindMissingNumberinArray {
	public static void main(String[] args) {
		int arr[] = { 1, 6 };
		for (int i = 0; i < arr.length - 1; i++) {
			int diff=arr[i + 1] - arr[i];
			if (diff> 1) {
				for(int j=1;j<diff;j++)
				{
					 System.out.print((arr[i] + j) + " ");
				}
//				System.out.print(arr[i] + 1);

			}
		}

	}

}

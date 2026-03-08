package interview;

public class MissingNumbers {
	public static void main(String[] args) {

		int[] a = { 1,6,7 };

		for(int i=a[0];i<a[a.length-1];i++) {
			boolean flag=false;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					System.out.print(i +" ");
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.print(i +" ");
			}
		}
	}
}

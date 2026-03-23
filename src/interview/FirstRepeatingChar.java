package interview;

public class FirstRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words="programmingp";
		int flag=0;
	
		for(int i=0;i<words.length();i++) {
			for(int j=i+1;j<words.length();j++) {
				if(words.charAt(i)!=words.charAt(j) ) {
					flag++;
					if(flag==1) {
						
						System.out.print(words.charAt(i));
					}
//					flag=false;
				}
			}
		}
	}

}

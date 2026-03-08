package interview;

public class countthevowelandconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="interview";
		int vo=0,co=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vo++;
			}
			else {
				co++;
			}
		}
		System.out.print(vo+"  "+co);
	}

}

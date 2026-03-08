package interview;

public class CountVowelsinaString {

	public static void main(String[] args) {
		String name="kArthiE";
		String low= name.toLowerCase();
		String[] spl=name.split("");
		int count=0;
		for(int i=0;i<low.length();i++)
		{
			if(spl[i].equalsIgnoreCase("a")||spl[i].equals("e")||spl[i].equals("i") ||spl[i].equals("o") || spl[i].equals("u"))
			{
				count++;
			}
		}
		System.out.print(count);
		
	}

}

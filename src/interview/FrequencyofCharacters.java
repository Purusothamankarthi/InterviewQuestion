package interview;

public class FrequencyofCharacters {
	public static void main(String[] args)
	{
		String s="programming";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=1;
			
			 boolean alreadyCounted = false;
	            for (int k = 0; k < i; k++) {
	                if (s.charAt(k) == ch) {
	                    alreadyCounted = true;
	                    break;
	                }
	            }
			if(alreadyCounted)
			{
				continue;
			}
			
			for(int j=i+1;j<s.length();j++)
			{
				if (ch == s.charAt(j)) {
                    count++;
                }
			}
			 System.out.println(ch + " = " + count);
		}
	}
}

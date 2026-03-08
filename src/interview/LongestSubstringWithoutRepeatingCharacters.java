package interview;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args)
	{
//		String s="abcabcbb";
//		int count=0;
//		String b="";
//		for(int i=0;i<s.length();i++)
//		{
//			boolean flag=false;
//			for(int j=0;j<i;j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					flag=true;
//				}
//			}
//			if(flag==false)
//			{
//				
//				count++;
//			}
//			
//		}
//		System.out.print(count);
//	}
		String s = "abcabcbb";
        int max = 0;

        for(int i = 0; i < s.length(); i++)
        {
            String temp = "";

            for(int j = i; j < s.length(); j++)
            {
                if(temp.indexOf(s.charAt(j)) != -1)
                    break;

                temp += s.charAt(j);

                if(temp.length() > max)
                    max = temp.length();
            }
        }

        System.out.println(max);
    }
}

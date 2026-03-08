package interview;

public class nonrepectingcharacter {
	public static void main(String[] args) {
	String s="leetcode";
	 for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);

         if (s.indexOf(ch) == s.lastIndexOf(ch)) {
             System.out.println(ch);
             break;
         }
     }
	}
}

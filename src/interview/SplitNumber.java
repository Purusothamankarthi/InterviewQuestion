package interview;

public class SplitNumber {
    public static void main(String[] args) {
        int number = 1230;
        String numStr = Integer.toString(number);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            System.out.println(digit);
        }
    }
}


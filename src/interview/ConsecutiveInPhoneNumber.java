package interview;

public class ConsecutiveInPhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "9876543210"; // or "9156782345", etc.
        int length = phoneNumber.length();

        for (int i = 0; i < length - 2; i++) {
            int d1 = phoneNumber.charAt(i) - '0';
            int d2 = phoneNumber.charAt(i + 1) - '0';
            int d3 = phoneNumber.charAt(i + 2) - '0';

            if (d1 + 1 == d2 && d2 + 1 == d3) {
                System.out.println("Found increasing consecutive: " + d1 + d2 + d3);
            } else if (d1 - 1 == d2 && d2 - 1 == d3) {
                System.out.println("Found decreasing consecutive: " + d1 + d2 + d3);
            }
        }
    }
}
 	
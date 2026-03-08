package interview;

public class Stringtointeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 255;
        Integer numObj = 255;
        
        // Using static toString methods
//        System.out.println("Decimal: " + Integer.toString(number));
//        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
//        System.out.println("Hex: " + Integer.toHexString(number));
	}

}

/* All data is transmitted as four digit integers i.e. 1234
 * I should be able to read 4 digits at once
 * Should be able to encrypt by replacing each digit with:
 * 				adding 7
 * 				remainder when dividing by 10
 * 				swap first and third
 * 				swap second and fourth
 * Print the encrypted integer
 * Should be able to enter encrypted integer and then decrypt it and print it out.
 */ 

public class Encrypter 
{
	static int num1;
	static int num2;
	static int num3;
	static int num4;
	static String encryptedDigits;
	
	public static int getNum1() {
		return num1;
	}
	
	public static void setNum1(int temp) {
		num1 = temp;
	}
	
	public static int getNum2() {
		return num1;
	}
	
	public static void setNum2(int temp) {
		num1 = temp;
	}
	public static int getNum3() {
		return num1;
	}
	
	public static void setNum3(int temp) {
		num1 = temp;
	}
	
	public static int getNum4() {
		return num1;
	}
	
	public static void setNum4(int temp) {
		num1 = temp;
	}
	
	public static String getString() {
		return encryptedDigits;
	}
	
	public static String encrypt(int number)
	{
		
		
		String encryptedDigit1;
		String encryptedDigit2;
		String encryptedDigit3;
		String encryptedDigit4;
		
		num4 = number % 10;
		number = number / 10;
		num3 = number % 10;
		number = number / 10;
		num2 = number % 10;
		number = number / 10;
		num1 = number % 10;
		
		num1 = num1 + 7;
		num1 = num1 % 10;
		
		num2 = num2 + 7;
		num2 = num2 % 10;
		
		num3 = num3 + 7;
		num3 = num3 % 10;
		
		num4 = num4 + 7;
		num4 = num4 % 10;
		
		encryptedDigit1 = String.valueOf(num1);
		encryptedDigit2 = String.valueOf(num2);
		encryptedDigit3 = String.valueOf(num3);
		encryptedDigit4 = String.valueOf(num4);
		
		encryptedDigits = encryptedDigit3 + encryptedDigit4 + encryptedDigit1 + encryptedDigit2;
		
		return encryptedDigits;
		
		 
		
		
	}
}

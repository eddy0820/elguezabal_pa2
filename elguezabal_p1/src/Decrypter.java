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
public class Decrypter 
{
	public static String decrypt(String number)
	{
		int num1;
		int num2;
		int num3;
		int num4;
		int temp;
		String decryptedDigit1;
		String decryptedDigit2;
		String decryptedDigit3;
		String decryptedDigit4;
		String decryptedDigits;
		
		temp = Integer.parseInt(number);
		
		num4 = temp % 10;
		temp = temp / 10;
		num3 = temp % 10;
		temp = temp / 10;
		num2 = temp % 10;
		temp = temp / 10;
		num1 = temp % 10;
		
		
		num1 = (num1 + 3) % 10;
		num2 = (num2 + 3) % 10;
		num3 = (num3 + 3) % 10;
		num4 = (num4 + 3) % 10;
		
		decryptedDigit1 = String.valueOf(num1);
		decryptedDigit2 = String.valueOf(num2);
		decryptedDigit3 = String.valueOf(num3);
		decryptedDigit4 = String.valueOf(num4);
		
		decryptedDigits = decryptedDigit3 + decryptedDigit4 + decryptedDigit1 + decryptedDigit2;
		
		return decryptedDigits;
		
		
	}
}

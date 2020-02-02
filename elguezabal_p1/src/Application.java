import java.util.Scanner;

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

public class Application 
{
	public static int getDigitsFromUser()
	{
		Scanner keyboard = new Scanner(System.in);
		String userDigits = "0000";
		
		int result = 0000;
		boolean i = true;	
		
		while(i) 
		{
			userDigits = keyboard.nextLine(); 
			
            if(userDigits.length() == 4) 
            {
                result = Integer.parseInt(userDigits);
    			
    			i = false;
            }
            else 
            {
                System.out.println("Please enter a 4 digit code");
            }
		}
		
		return result;
	}
	public static void main(String args[])
	{
		System.out.println(Encrypter.encrypt(getDigitsFromUser()));
		System.out.println(Decrypter.decrypt(Encrypter.getString()));
	}
}

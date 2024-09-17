/*
 * Steven Wang
 * 9/17/2024
 * Period 3
 * Binary2Decimal / Decimal2Binary converter program
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "";
		boolean continueConvert = true;
		
		while(continueConvert) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("Which conversion would you like to perform: 1: BinaryToDecimal, 2: DecimalToBinary");
			while(true) {
				choice = input.nextLine();
				if( !(choice.equals("1") || choice.equals("2")) ) {
					System.out.println("Please enter a valid choice");
					
				}
				else {
					break;
				}
			}
			if (choice.equals("1")) {
				System.out.println("Please enter a binary number: ");
				String binaryString = input.nextLine();
				System.out.println("Converted: " + binToDec(binaryString));
			} else {
				System.out.println("Please enter a decimal number: ");
				int binaryString = input.nextInt();
				input.nextLine();
				System.out.println("Converted: " + decToBin(binaryString));
			}
			
			System.out.println("Convert another number?: y/n");
			if(input.nextLine().equals("y")) {
				continueConvert = true;
			} else {
				continueConvert = false;
			}

		}	
		input.close();

	}
	public static int binToDec(String input) {
        String binary = input;
        int result = 0;
        for(int i = 0; i < binary.length(); i++){
        	int pow = binary.length() - i - 1;
        	String curDigit = binary.substring(i, i+1);
        	result += Integer.parseInt(curDigit) * (int) Math.pow(2, pow);
        }
        return result;
	}	

	public static String decToBin(int input) {
			String result = "";
			while(input > 0) {
				result = String.valueOf(input % 2) + result;
				input = input / 2;
			}
			return result;
	}

}

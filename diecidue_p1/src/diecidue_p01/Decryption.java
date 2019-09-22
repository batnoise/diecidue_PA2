package diecidue_p01;

import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//variables
		int userInput;
		int firstThree;
		int firstTwo;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		int temp1;
		int temp2;
		
		//user input
		System.out.print("Please provide your encrypted four-digit integer: ");
		userInput = scnr.nextInt();
		
		//decryption
		//separate each digit
		fourthDigit = userInput % 10;
		firstThree = userInput / 10;
		thirdDigit = firstThree % 10;
		firstTwo = firstThree / 10;
		secondDigit = firstTwo % 10;
		firstDigit = firstTwo / 10;
		
		
		//swap 1 and 3
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		
		//swap 2 and 4
		temp2 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp2;
		
		//add 3 to each
		firstDigit = firstDigit + 3;
		secondDigit = secondDigit + 3;
		thirdDigit = thirdDigit + 3;
		fourthDigit = fourthDigit + 3;
		
		//get remainder
		firstDigit = firstDigit % 10;
		secondDigit = secondDigit % 10;
		thirdDigit = thirdDigit % 10;
		fourthDigit = fourthDigit % 10;
		
		//output result
		//System.out.println(firstDigit);
		System.out.println(firstDigit + "" + secondDigit + thirdDigit + fourthDigit);
		scnr.close();
	}

}
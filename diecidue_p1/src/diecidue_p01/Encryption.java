package diecidue_p01;

import java.util.Scanner;

public class Encryption {

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
		System.out.print("Please provide a four-digit integer: ");
		userInput = scnr.nextInt();
		
		//encryption
		//separate each digit
		fourthDigit = userInput % 10;
		firstThree = userInput / 10;
		thirdDigit = firstThree % 10;
		firstTwo = firstThree / 10;
		secondDigit = firstTwo % 10;
		firstDigit = firstTwo / 10;
		
		//add 7 to each digit
		firstDigit = firstDigit + 7;
		secondDigit = secondDigit + 7;
		thirdDigit = thirdDigit + 7;
		fourthDigit = fourthDigit + 7;
		
		//get remainder when divided by 10
		firstDigit = firstDigit % 10;
		secondDigit = secondDigit % 10;
		thirdDigit = thirdDigit % 10;
		fourthDigit = fourthDigit % 10;
		
		
		//swap 1 and 3
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		
		//swap 2 and 4
		temp2 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp2;
		
		//output result
		//System.out.println(secondDigit + "" + fourthDigit);
		System.out.println(firstDigit + "" + secondDigit + thirdDigit + fourthDigit);
		scnr.close();
	}

}
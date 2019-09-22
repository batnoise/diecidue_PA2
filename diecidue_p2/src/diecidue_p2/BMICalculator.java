package diecidue_p2;
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		//variables
		String userInput;
		boolean isMetric = false;
		int bmiCustomaryConstant = 703;
		double userWeight;
		double userHeight;
		double bmi = 0;
		
		//prompt user
		System.out.print("Are you entering your weight in pounds or kilograms? ");
		userInput = scnr.next();
		
		//which method
		if (userInput.equalsIgnoreCase("pounds") || userInput.equalsIgnoreCase("lbs")) {
			isMetric = false;
		}
		else if (userInput.equalsIgnoreCase("kilograms") || userInput.equalsIgnoreCase("kg")) {
			isMetric = true;
		}
		
		//prompt user for weight and height
		System.out.print("Enter your weight: ");
		userWeight = scnr.nextDouble();
		System.out.print("Enter your height (in inches if you entered pounds, in meters if you entered kilograms): ");
		userHeight = scnr.nextDouble();
		
		//perform calculations based on methods
		//metric
		if (isMetric == false) {
			bmi = (bmiCustomaryConstant * userWeight) / (userHeight * userHeight);
		}
		else if (isMetric == true) {
			bmi = userWeight / (userHeight * userHeight);
		}
		
		//output results
		System.out.printf("Your BMI is %.2f\n", bmi);
		
		//output BMI categories
		System.out.println("\nThe following are the BMI categories and their values from the National Heart Lung and Blood Institute:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		System.out.println("\nAccording to these, you are: ");
		
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal weight");
		}
		else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweight");
		}
		else {
			System.out.println("Obese");
		}
		
		scnr.close();

	}

}

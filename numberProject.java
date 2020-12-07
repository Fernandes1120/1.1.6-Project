
// Project PLTW (1.1.6)
// Author: Aidan Fernandes
// Date: 12/7/20
// AP CSA

import java.util.Scanner;

public class numberProject {

	public static void main(String[] args) {
		
		System.out.println("1.1.6 Project: ");
		System.out.println("");
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter any integer");
		System.out.println("");
		
		int userNumber = userInput.nextInt(); 
		
		int stepOne = userNumber * 2;
		
		System.out.print("First, we double your number: ");
		System.out.println(stepOne);
		System.out.println("");
	
		
		int stepTwo = stepOne + 6;
		
		System.out.print("Next, we add six to the new number: ");
		System.out.println(stepTwo);
		System.out.println("");

		
		int stepThree = stepTwo / 2;
		
		System.out.print("Then, we divide the number we added with six by half: ");
		System.out.println(stepThree);
		System.out.println("");
		
		int stepFour = stepThree - userNumber;
		
		System.out.print("Finally, we subtract the latest result by your original input to get our final result: ");
		System.out.println(stepFour);
		System.out.println("");
		
		int result =  stepFour;
		
		System.out.print("The final result is : ");
		System.out.println(result);
		

	}

}

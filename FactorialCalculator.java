import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) { //need to use .equalsIgnoreCase to compare Strings
			System.out.println("Please enter a number between 1 and 10."); //requesting input from the Scanner
			int input = scan1.nextInt(); //receives the input from the scanner
			scan1.nextLine(); //garbage collector after receiving int input

			if (input > 10 || input < 1) { //if input is outside the parameters requested of the user

				System.out.println("This number is not between 1 and 10.");

			} else { //if input is within parameters requested of the user
				System.out.println("The factorial of your number is:");
				getFactorial(input); //getFactorial(input) is what calls the method

			}

			System.out.println("Would you like to enter another number? Enter yes or no:");
			choice = scan1.nextLine();

		}
		
		System.out.println("Goodbye!");
		scan1.close();
	}

	public static void getFactorial(int x) { 
		//this method prints output to the console, it doesn't actually return anything

		long result = 1;

		for (int i = 1; i <= x; i++) {

			result *= i;
			System.out.println(i + "! = " + result);
		}

	}
}

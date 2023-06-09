package game;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.random;

public class game1 {

	// Function that implements
	public static void
	guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		// Generate the numbers
		int number = 1 + (int)(1000
							* Math.random());

		// Given K trials
		int K = 6;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 1000."
			+ "Guess the number"
			+ " within 6 trials.");

		// Iterate over K Trials
		for (i = 0; i < K; i++) {

			System.out.println(
				"Guess the number:");

			// Take input for guessing
			guess = sc.nextInt();

			// If the number is guessed
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != K - 1) {
				System.out.println(
					"The number is "
					+ "greater than " + guess);
			}
			else if (number < guess
					&& i != K - 1) {
				System.out.println(
					"The number is"
					+ " less than " + guess);
			}
		}

		if (i == K) {
			System.out.println(
				"You have exhausted"
				+ " K trials.");

			System.out.println(
				"The number was " + number);
		}
	}
	
	catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
	}
		// exception block

	// Driver Code
	public static void
	main(String arg[])
	{

		// Function Call
		guessingNumberGame();
	}
}

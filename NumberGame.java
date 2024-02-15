package com.Game;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {

public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
Random random = new Random();

   int lowerBound = 1;
   int upperBound = 100;
   int maxAttempts = 10;
   int rounds = 0;
   int totalScore = 0;

System.out.println("Welcome to the Number Game!");
    do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;

System.out.println("\nRound " + (rounds + 1) + ": Guess the number between " + lowerBound + " and " + upperBound);

    while (attempts < maxAttempts) {
System.out.print("Enter your guess: ");
    int userGuess = scanner.nextInt();

    if (userGuess == targetNumber) {
System.out.println("Congratulations! You guessed the correct number in " + (attempts + 1) + " attempts.");
    totalScore += maxAttempts - attempts;
    break;
  } else if (userGuess < targetNumber) {
System.out.println("Too low. Try again.");
  } else {
System.out.println("Too high. Try again.");
   
  }

   attempts++;
  }

   if (attempts == maxAttempts) {
System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + targetNumber);
  }

System.out.print("Do you want to play again? (yes/no): ");
   String playAgain = scanner.next().toLowerCase();

   if (playAgain.equals("yes")) {
     rounds++;
 } else {
System.out.println("Thanks for playing! Your total score is: " + totalScore);
 }

  } while (rounds > 0);
 }
}



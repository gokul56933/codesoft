import java.util.Random;
import java.util.Scanner;
public class codesoft1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        boolean playAgain = true;
        int totalScore = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        
        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1;
            // System.out.println(randomNumber);
            int attemptsLeft = 7;  
            boolean guessedCorrectly = false;
            
            System.out.println("I have chosen a number between 1 and 100. Try to guess it!");
            
            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    guessedCorrectly = true;
                    totalScore += attemptsLeft; 
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }
            
            if (!guessedCorrectly) {
                System.out.println("You've run out of attempts! The correct number was: " + randomNumber);
            }
            
            System.out.println("Your current score: " + totalScore);
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }
        
        System.out.println("Thanks for playing! Your final score: " + totalScore);
    }
}

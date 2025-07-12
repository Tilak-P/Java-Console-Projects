package JAVA_PROJECTS;
import java.util.*;
import java.util.Random;
class Number_Guessing_Game {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();
    public static void main(String[] args) {
        boolean playAgain = true;
        System.out.println(" Welcome to the Number Guessing Game!");
        while (playAgain) {
            int max = chooseDifficulty();
            int targetNumber = random.nextInt(max) + 1;
            int maxAttempts = setMaxAttempts(max);
            int attempts = 0;
            int Guess = -1;
            System.out.println("I have chosen a number between 1 and " + max + ". Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts. Good luck!");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                Guess = getValidNumber();
                attempts++;
                if (Guess > targetNumber) {
                    System.out.println("Too high! Try again.");
                }
                else if (Guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                    break;
                }
            }
            if (Guess != targetNumber) {
                System.out.println(" You've run out of attempts! The correct number was " + targetNumber + ".");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
    private static int chooseDifficulty() {
        System.out.println("Select Difficulty Level:");
        System.out.println("1️ Easy (1-50)");
        System.out.println("2️ Medium (1-100)");
        System.out.println("3️ Hard (1-200)");
        int choice;
        do {
            System.out.print("Enter your choice (1-3): ");
            choice = getValidNumber();
        } while (choice < 1 || choice > 3);
        switch (choice) {
            case 1: return 50;
            case 2: return 100;
            default: return 200;
        }
    }
    private static int setMaxAttempts(int range) {
        if (range == 50){
            return 10;
        }
        if (range == 100){
            return 8;
        }
        return 6;
    }
    private static int getValidNumber() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid number: ");
            sc.next();
        }
        return sc.nextInt();
    }
}

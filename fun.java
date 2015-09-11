import java.util.Scanner;
import java.util.Random;
public class fun {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Let's play a game!");
        System.out.println("I just picked random number between 1 and 50000");
        System.out.println("You get 15 tries to guess the number!");
        System.out.println("I will tell you wether or not the number is larger or smaller then the number you guessed");
        
        int randomNumber = rand.nextInt((49999)+1);
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Enter your guess : ");
            int guess = scan.nextInt();
            System.out.println("That was guess number "+(i+1));
            if (guess == randomNumber) {
                System.out.println("You guessed it right You Win!");
                return ;
            } else if (guess > randomNumber)
                System.out.println("You're too high dummy");
            else
                System.out.println("Too low dummy");
            
        }
        System.out.println(randomNumber);
    }
}
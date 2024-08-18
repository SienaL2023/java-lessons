// make a number guessing game
// when the game starts there is a number that  is selected between zero-twenty
// user will be asked to guess the number, from that, you will tell the user
// higher or lower until the user guesses the correct num
import java.util.Scanner;

public class Game{
    public static void main(String[] args) {
        System.out.println("welcome to my guessing number game, guess a number between 0-20! you get 5 tries");
        game();
    }

    public static void game(){
        final int num = (int)(Math.random()*21); // finds nums 0-20
        Scanner objScanner = new Scanner(System.in); // u have an object that lets u get the scanner methods
        System.out.println("enter your guess: ");
        int guess = objScanner.nextInt();
        int tries = 5;
        while (guess != num){
            tries -= 1;
            if(guess == num || tries == 0) // || is or
                break;
            else if (guess < num)
                System.out.println("nope, too low!");
            else
                System.out.println("nope, too high!");
            System.out.println("please try again enter your guess: ");
            System.out.println("you have " + tries + " tries left");
            guess = objScanner.nextInt(); // to get next input
            
        }
        if(guess == num)
            System.out.println("correct!!");
        else
            System.out.println("you lost!");
            
    }

}

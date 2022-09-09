
/**
 * Plays the HiLo Guessing Game
 * 
 * Hans Slechta
 * 0.0.01
 */

import java.util.Scanner;
import java.util.Random;

public class HiLoGame
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        Random gen = new Random ();
        
        int selection;
        int guessCount;
        int game = 0;
     
        while (game == 0)
        {         
            selection = gen.nextInt(100) + 1;
            guessCount = 0;
            
            System.out.println ("Welcome to the Best Hi-Lo Guessing Game Ever Designed!");
            System.out.println ("All guesses should be between 1 and 100, inclusive.");
            System.out.println ("If you wish to quit at any time, please enter -1");
            System.out.println ("The computer is ready. Are you? Enter your guess here:");
            int guess = scan.nextInt();

            while (guess != selection && guess != -1)
                {
                    System.out.println ("Sorry, that is not correct!");
                    if (guess < selection)
                        System.out.println ("Your guess was too low.");
                    
                    if (guess > selection)
                        System.out.println ("Your guess was too high.");
        
                    guessCount++;
                    
                    System.out.println ("Enter your guess here:");
                    guess = scan.nextInt();
                }
        
            if (guess == selection)
                {
                    guessCount++;
                    System.out.println ("Congratulations! That is the correct number!");
                    System.out.println ("You guessed the number in " + guessCount + " guesses.");
                    System.out.println ("Do you want to play again? Enter 0 for yes, 1 for no.");
                    game = scan.nextInt();
                }
                
            if (guess == -1)
                {
                    System.out.println ("Sorry! You have quit the game!");
                    System.out.println ("Do you want to play again? Enter 0 for yes, 1 for no.");
                    game = scan.nextInt();
                }
        }
        scan.close();
    }
}

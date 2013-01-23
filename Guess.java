
/**
 * Guess.java 
 * Steven Pajuelo
 * spajuelo 
 * Programming assignment 2 
 * Construct a guess program, alloted only 3 guesses to pick a number between 1 and 10.
 */ 
import java.util.Scanner;
import java.util.Random;

public class Guess{

 public static Scanner sc = new Scanner(System.in);
 public static int ranNum, guess; 
 public static Guess guessObj = new Guess(); 
 public static String guessStr; 
   
    public static void main(String [] args){
      Random r = new Random();
      ranNum = (int) (r.nextDouble()*10 + 1); 
      guessObj.guess(); 
    }
    
    // Start guessing game, run until right and terminate when exceeds 3 guesses
    public void guess(){
      int i = 1; 
      Boolean cont = true; 
      System.out.println("I'm thinking of an integer in the range 1 to 10. You have three guesses. \n");
      while(cont && i<4){
        if(i==1){
          guessStr = "first";
        }else if(i==2){
          guessStr = "second";
        }else{
          guessStr = "third";
        }
           System.out.println("Enter your " + guessStr + " guess: ");  
           guess = sc.nextInt();
           guessObj.checkGuess(guess); 
             if(i==3 && (ranNum!=guess)){
                System.out.println("You lose, guess was " + ranNum + ". Goodbye..." + " \n " );   
                cont = false; 
             }else if(ranNum==guess){
                cont = false; 
             }else{
                System.out.println("Guess again!" + " \n ");
                cont = true; 
             }
       i++;
      }
    }
    // Check guess range
    public void checkGuess(int aGuess){
      if(ranNum==guess){
         System.out.println("You win!");
      }else if(ranNum < guess && ranNum!=guess){
         System.out.println("Guess is too high."); 
      }else{
         System.out.println("Guess is too low."); 
      }
    }
}

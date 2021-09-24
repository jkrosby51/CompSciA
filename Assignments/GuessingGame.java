import java.util.*;
public class GuessingGame{
      public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int rndmNum = random.nextInt(20 - 1) + 1;
      int userGuess = 0;
      
      //System.out.println("Random Number = " + rndmNum);
      
      for (int i = 0; userGuess != rndmNum; i++){
         System.out.println("Guess #" + (i + 1));
         System.out.print("Enter a number between 1 and 20: ");
         userGuess = input.nextInt();
         
         if(userGuess == rndmNum){
            System.out.println("You Win!");
         } else {
            System.out.println("Try Again.");
         }
      }
   }
}
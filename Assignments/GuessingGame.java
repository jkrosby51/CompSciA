import java.util.*;
public class GuessingGame{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      boolean play = true;
      String userInput = "";
      boolean quit = false;
      int gameCount = 1;
      int totalGuess = 0;
      int[] guessPerGame = new int[100];
      int bestGame = 100;
      int temp1 = 0;
      
      while(quit == false){
         if(play == false){
            System.out.println("Would you like to play again?");
            userInput = input.nextLine();
            userInput = userInput.toLowerCase();
            System.out.println(userInput);
            if(userInput.startsWith("y")){
               play = true;
               gameCount++;
               
            } else {
               System.out.println("I'll take that as a no, goodbye!");
               quit = true;
               
            }
         } 
         if(play == true){
            temp1 = guessingGame(temp1);
            play = false;
         }
         
         if(bestGame >= temp1 && temp1 > 0){ 
            bestGame = temp1; 
         }
         totalGuess += temp1;
         temp1 = 0;
      }
      stats(gameCount, totalGuess, bestGame);
      
      
   }
      
   public static int guessingGame(int temp1){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int rndmNum = random.nextInt(100 - 1) + 1;
      int userGuess = 0;
      int guessCount = 0;
      System.out.println("\nHi, welcome to the game!\n");
      //System.out.println("Random Number = " + rndmNum);
      for (int i = 1; userGuess != rndmNum; i++){
         System.out.print("Enter a number between 1 and 100: ");
         userGuess = input.nextInt();
         if(userGuess == rndmNum){
            if(i == 1){
               System.out.println("You got it first try!");
               temp1 = i;
            } else {
               System.out.println("You guessed correctly in " + i + " guesses.");
               temp1 = i;
            }
         } else if(userGuess > rndmNum){
            System.out.println("It's Lower");
         } else if(userGuess < rndmNum){
            System.out.println("It's Higher");
         }
      }
      return temp1;
   }
   public static void stats(int gameCount, int totalGuess, int bestGame){
      double avgGuess = 0;
      avgGuess = (double)totalGuess / gameCount;
      
      System.out.println("Overall Results:");
      System.out.println("Total Games   = " + gameCount);
      System.out.println("Total Guesses = " + totalGuess);
      System.out.println("Guesses/game  = " + avgGuess);
      System.out.println("Best Game     = " + bestGame);
   }
}
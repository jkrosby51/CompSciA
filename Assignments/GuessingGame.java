import java.util.*;
public class GuessingGame{
   public static final int maxNum = 100;
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      boolean play = true;
      String userInput = "";
      boolean quit = false;
      int gameCount = 1;
      int totalGuess = 0;
      int[] guessPerGame = new int[maxNum];
      int bestGame = 100;
      int temp1 = 0;
      System.out.println("This program allows you to guess random numbers.");
      System.out.println("I will think of a number between 1 and 100");
      System.out.println("and you will try to guess it.");
      System.out.println("After each guess, I will give you a clue about");
      System.out.println("whether the correct number is higher or lower.");
      
      while(quit == false){
         if(play == false){
            System.out.print("Do you want to play again? ");
            userInput = input.nextLine();
            userInput = userInput.toLowerCase();
            //System.out.println(userInput);
            System.out.println("");
            if(userInput.startsWith("y")){
               play = true;
               gameCount++;
               
            } else {
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
      int rndmNum = random.nextInt(maxNum - 1) + 1;
      int userGuess = 0;
      int guessCount = 0;
      //System.out.println("Random Number = " + rndmNum);
      System.out.println("I'm thinking of a number between 1 and " + maxNum + "...");
      for (int i = 1; userGuess != rndmNum; i++){
         System.out.print("Your guess? ");
         
         userGuess = input.nextInt();
         if(userGuess == rndmNum){
            if(i == 1){
               System.out.println("You got it first try!");
               temp1 = i;
            } else {
               System.out.println("You got it right in " + i + " guesses!");
               temp1 = i;
            }
         } else if(userGuess > rndmNum){
            System.out.println("It's lower.");
         } else if(userGuess < rndmNum){
            System.out.println("It's higher.");
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
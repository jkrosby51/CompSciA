import java.util.*;
public class Mancala{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      boolean endGame = false;
      boolean singleplayer = false;
      int userInput = 0;
      
      System.out.println("Welcome To Virtual Mancala!");
      
      while(endGame == false){
         System.out.println("----- MENU -----");
         if(singleplayer == true)
            System.out.println("The program is in Singleplayer mode.");
         else
            System.out.println("The program is in Multiplayer mode.");
         System.out.println("Enter the number associated with your preferred action.");
         System.out.println("\n1. Play Game \n2. Instructions \n3. Options \n4. Quit \n");
         
         userInput = input.nextInt();
         
         if(userInput == 1){
            
         } else if(userInput == 2){
            
         } else if(userInput == 3){
            System.out.println("How many people are playing? \nEnter either '1' or '2' for Singleplayer or Multiplayer.");
            userInput = input.nextInt();
            int i = 0;
            
            while(i = 0){
               if(userInput = 1){
                  singleplayer = true;
                  i = 1;
               }
               else if(userInput = 2){
                  singleplayer = false;
                  i = 1;  
               }
               else
                  System.out.println("That is not a valid entry. Try Again.");
            }
         } else if(userInput == 4){
            endGame = true;
         } else {
            clearConsole();
            System.out.println("That is not a valid entry. Try Again.\n");
         }
      }
   }
   
   
   public final static void clearConsole(){
      for(int i = 0; i < 20; i++){
      System.out.println("");
      }
   }
   public static void wait(int ms){
       try
       {
           Thread.sleep(ms);
       }
       catch(InterruptedException ex)
       {
           Thread.currentThread().interrupt();
       }
   
  }
   
   
   
}
/*    ------BUGS-------
   - Player 2 uses Player 1's board
   - Singleplayer/Multiplayer is opposite of what the menu says
   - Probably like 20 more things i either forgot about or haven't found yet
*/

import java.util.*;
public class Mancala{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      boolean endGame = false;
      boolean singleplayer = false;
      int userInput = 0;
      int winner = 0; // 1 is home, 2 is away
      
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
            clearConsole();
            System.out.print("Starting Game");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            wait(1500);
            System.out.println("\n");
            winner = playGame(singleplayer);
            //clearConsole();
         } else if(userInput == 2){
            System.out.println("Players sit on opposite sides with the large bin to a player's right designated their home bin. On a turn, \na player selects on of the six pits to remove the stones from and then 'sows' the stones counterclock-\nwise around the board, placing one stone in each pit including the player's home bin (but excluding \nthe opponent's home bin). If the last stone lands in the player's home bin, the player gets another turn. \nIf the last stone lands in an empty pit on the player's side of the board, the player takes all stones in \nthe corresponding pit on the oppponent's side and places them in the player's home bin. When a player \ncannot play, the game is over and all stones remaining in the opponent's pits go to the oppoenent's home \nbin. The winner is the player with the most stones in the player's home bin at the end of the game.\n\n");
            wait(4000);
         } else if(userInput == 3){
            System.out.println("How many people are playing? \nEnter either '1' or '2' for Singleplayer or Multiplayer.");
            userInput = input.nextInt();
            int i = 0;
            
            while(i == 0){
               if(userInput == 1){
                  singleplayer = true;
                  i = 1;
               }
               else if(userInput == 2){
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
   
   public static int playGame(boolean singleplayer){
      Random random = new Random();
      Scanner input = new Scanner(System.in);
      int[] board = new int[] {0, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3};
      int winner = 0;
      char charInput = 'q';
      int intInput = 0;
      int turn = 1; //1 = player 1, 2 = player 2
      int i = 0;
      int e = 0;
      int amount = 0;
      boolean endGame = false;
      
      Map<Character, Integer> hm
            = new HashMap<Character, Integer>();
        hm.put('a', 1);
        hm.put('b', 2);
        hm.put('c', 3);
        hm.put('d', 4);
        hm.put('e', 5);
        hm.put('f', 6);
       
      Map<Integer, Integer> topBot
            = new HashMap<Integer, Integer>();
        topBot.put(1, 13);
        topBot.put(2, 12);
        topBot.put(3, 11);
        topBot.put(4, 10);
        topBot.put(5, 9);
        topBot.put(6, 8);

      
      
      while(endGame == false){
         while(turn == 1){
            printBoard(board, turn);
            System.out.println("Player 1, which pit would you like to take? Enter the associated letter.");
            charInput = input.next().charAt(0);
            charInput = Character.toLowerCase(charInput);
            intInput = hm.get(charInput);
            
            amount = board[intInput];
            board[intInput] = 0;
            e = 0;
            for(i = (intInput+1); e < amount; i++){
               if(i == 14)
                  i = 1;
               board[i]++;
               e++;
            }
            i--;
            //System.out.println("i: " + i);
            if(board[i] == 1 && i != 7){
               board[7] += board[i] + board[topBot.get(i)];
               board[i] = 0;
               board[topBot.get(i)] = 0;
            if(i != 7)
               turn = 2;
            }
         }
         //endGame = gameStatus(board, turn);
         while(singleplayer == true && turn == 2){
            printBoard(board, turn);
            System.out.println("Player 2, which pit would you like to take? Enter the associated letter.");
            charInput = input.next().charAt(0);
            charInput = Character.toLowerCase(charInput);
            intInput = hm.get(charInput);
            intInput = topBot.get(intInput);
            
            amount = board[intInput];
            board[intInput] = 0;
            e = 0;
            for(i = (intInput+1); e < amount; i++){
               if(i == 14)
                  i = 0;
               if(i == 7)
                  i = 8;
               board[i]++;
               e++;
            }
            i--;
            //System.out.println("i: " + i);
            if(board[i] == 1 && i != 0){
               board[0] += board[i] + board[topBot.getKey(i)];
               board[i] = 0;
               board[topBot.getKey(i)] = 0;
            if(i != 0)
               turn = 1;
            } 
         }
      }
      printBoard(board, turn);
      
         
      
      
      return winner;
   }
   
   public static void printBoard(int[] board, int turn){    
      //   13 12 11 10 9  8
      // 0                  7
      //   1  2  3  4  5  6
      //   A  B  C  D  E  F
      clearConsole();
      if(turn == 2)
         System.out.println("  A  B  C  D  E  F");
      System.out.println("  " + board[13] + "  " + board[12] + "  " + board[11] + "  " + board[10] + "  " + board[9] + "  " + board[8]);
      System.out.println(board[0] + "                  " + board[7]);
      System.out.println("  " + board[1] + "  " + board[2] + "  " + board[3] + "  " + board[4] + "  " + board[5] + "  " + board[6]);
      if(turn == 1)
         System.out.println("  A  B  C  D  E  F");
   }
   public static boolean gameStatus(int[] board, int turn){
      int p1 = 0;
      int p2 = 0;
      boolean endGame = false;
      
      for(int i = 13; i > 7; i--)
         p2 += board[i];
      for(int i = 1; i < 7; i++)
         p1 += board[i];
         
      if(turn == 2 && p2 == 0)
         endGame = true;
      else if(turn == 1 && p1 == 0)
         endGame = true;
         
      return endGame;
   }
   
   public final static void clearConsole(){
      System.out.println(new String(new char[50]).replace("\0", "\r\n"));
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

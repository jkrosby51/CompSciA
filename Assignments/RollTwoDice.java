import java.util.*;
public class RollTwoDice{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int dice1 = 0;
      int dice2 = 0;
      int diceSum = 0;
      int userNum = 0;
      
      while(userNum > 12 || userNum < 2){
         System.out.print("Desired sum: ");
         userNum = input.nextInt();
         if(userNum > 12 || userNum < 2){
            System.out.println("That's not possible. Try again.");
         }
      }
      
      
      while(diceSum != userNum){
         dice1 = random.nextInt(7 - 1) + 1;
         dice2 = random.nextInt(7 - 1) + 1;
         diceSum = dice1 + dice2;
         System.out.println(dice1 + " and " + dice2 + " = " + diceSum);
      }
   }
}
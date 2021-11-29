import java.util.*;
public class mastermindGame{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      //random.nextInt(max - min) + 1;
      int pegCount = 0;
      int colorCount = 0;
      int[] pegs = new int[10];
      int[] colors = new int[9];
      int[] dupeCheck = new int[10];
      int temp = 0;
      int endGame = 0;
      
      System.out.print("Enter the number of pegs (1-10): ");
      pegCount = input.nextInt();
      System.out.print("Enter the number of colors (1-9): ");
      colorCount = input.nextInt();
      
      for(int i = 0; i < colorCount; i++)
         colors[i] = random.nextInt(9 - 1) + 1;
      for(int i = 0; i < pegCount; i++)
         pegs[i] = colors[random.nextInt(colorCount)];
      
      for(int i = 0; endGame == 0; i++){
         System.out.println("Guess 1:");
         for(int e = 0; e < pegCount; e++){
            System.out.print("Color for peg " + e + ": ");
            temp = input.nextInt();
            for(int a = 0; a < colorCount; a++){
               
               if(pegs[e] == temp){
                  dupeCheck[temp]
               }
            }
         }
      }
   ////////////////////////
   }
}
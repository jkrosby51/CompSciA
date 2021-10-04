import java.util.*;
public class RandomWalk{
   public static void main(String[] args){
      Random random = new Random();
      int rndmNum = 0;
      int toBridge = 0;
      int totalSteps = 0;
      double averageSteps = 0;
      int[] stepArray = new int[50];
      for(int i = 0; i < 50; i++){
         for(int f = 1; toBridge != 4 && toBridge != -4; f++){
            rndmNum = random.nextInt((1) + 1);
            //System.out.print(rndmNum + ", ");
            if(rndmNum == 1){
               toBridge++;
            } else if (rndmNum == 0){
               toBridge--;
            }
            stepArray[i] = f;
         }
         toBridge = 0;
         System.out.println("Turn #" + (i + 1) + " took " + stepArray[i] + " steps.");
      }
      for(int j = 0; j < 50; j++){
         totalSteps = totalSteps + stepArray[j];
         //System.out.println("totalSteps: " + totalSteps);
      } 
      averageSteps = totalSteps / 50;
      System.out.println("\nThe average steps per turn was " + averageSteps);
      
   }
}

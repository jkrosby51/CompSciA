import java.util.*;
public class Hailstone1{
   public static void main(String[] args){
      int tempCount = 0;
      int temp1 = 0;
      int temp2 = 0;
      int tempCurrent = 0;
      int tempReturn = 0;
      int tempHighest = 0;
      int highestNum = 0;
      int[] isTrue = new int[200];
      int[] turnCount = new int[200];
      double avgIsTrue = 0;
      
      
      for(int i = 0; i < 200; i++){
         tempCurrent = (i+1);
         while(tempCount < 500 && tempReturn == 0){
         //System.out.println("I: " + i);
            if(temp1 == 4 && temp2 == 2){
               isTrue[i] = 1; //1 = true; 0 = false
               tempReturn = 1;
            }else{
               temp1 = tempCurrent;
               if((tempCurrent % 2) == 0){
                  tempCurrent /= 2;
               } else {
                  tempCurrent = (tempCurrent * 3) + 1;
               }
               temp2 = tempCurrent;
               tempCount++;
               //System.out.println("tempCount: " + tempCount);
            }
            if(temp1 !=4 || temp2 !=2){
               isTrue[i] = 0;
            }
         }
         tempReturn = 0;
         turnCount[i] = tempCount;
         tempCount = 0;
      }
      
      for(int j = 0; j < 200; j++){
        avgIsTrue += isTrue[j];
      }
      avgIsTrue /= 200;
      //System.out.println("\navgIsTrue: " + avgIsTrue);
      
      /*for(int f = 0; f < 200; f++){
         if(turnCount[f] > tempHighest){
            tempHighest = turnCount[f];
            highestNum = f;
            System.out.println("highestnum: " + highestNum);
            System.out.println("temphighest: " + tempHighest);
         }
      }
     */
      
      if(avgIsTrue == 1){
         System.out.println("All numbers within 1-200 eventually reach the loop.");
         //System.out.println("Highest Amount Of turns used was " + tempHighest + " on number " + highestNum);
      } else {
         System.out.println("Only some numbers reach the loop.");
      }
   }
}
import java.util.*;
public class avgChance{
   public static void main(String[] args){
      int length = 200;
      double[] avg = new double[length];
      double total = 0;
      
      for(int i = 0; i < length; i++){
         avg[i] = avgCheck();
         total += avg[i];
      }
      total /= length;
      double pctEven = total * 100;
      System.out.println("Out of " + (length * 25) + " random numbers, " + (int)pctEven + "% were even.");
   }
   public static double avgCheck(){
      Random random = new Random();
      int rndmNum[] = new int[25];
      int rndmEven[] = new int[25];
      int rndmOdd[] = new int[25];
      int evenCount = 0;
      int oddCount = 0;
      double pctEven = 0;
      
      for(int i = 0; i < 25; i++){
         rndmNum[i] = random.nextInt(100);
         
         if(rndmNum[i] % 2 == 0){
            rndmEven[evenCount] = rndmNum[i];
            evenCount++;
         } else {
            rndmOdd[oddCount] = rndmNum[i];
            oddCount++;
         }  
      }
      /*
      System.out.println("Odd:");
         for(int o = 0; o < oddCount; o++)
            System.out.print(rndmOdd[o] + " ");
            
      System.out.println("\nEven:");
         for(int e = 0; e < evenCount; e++)
            System.out.print(rndmEven[e] + " "); 
      */
         
      pctEven = evenCount / oddCount;
      return pctEven;
   }
}
// fix array list, add mode, median, and histogram
import java.util.*;
public class Analysis{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> numSet = new ArrayList<Integer>();
      int temp = 0;
      int numCount = 0;
      int max = 0;
      int min = 50;
      int oF = 0, sT = 0, oeOf = 0, osT = 0, toTwf = 0, tsT = 0, toTf = 0, tsF = 0, foFf = 0, fsF = 0; //xxYy | x == 1st letter of each digit in min | y == 1st letter of each digit in max 
      int total = 0;
      int avgNum = 0;
      
      for(int i = 0; temp != -1; i++){
         System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
         temp = input.nextInt();
         
         if(temp >= 50 || temp <= 1)
            numSet.add(temp);
         else if(temp != -1)
            System.out.println("Only values between 1 and 50 are counted.");
            
         if(numSet.get(numCount) > max)
            max = numSet.get(numCount);
         if(numSet.get(numCount) < min)
            min = numSet.get(numCount);
            
         total += temp;
            
         if(temp >= 1 && temp <= 5)
            oF++;
         if(temp >= 6 && temp <= 10)
            sT++;
         if(temp >= 11 && temp <= 15)
            oeOf++;
         if(temp >= 16 && temp <= 20)
            osT++;
         if(temp >= 21 && temp <= 25)
            toTwf++;
         if(temp >= 26 && temp <= 30)
            tsT++;
         if(temp >= 31 && temp <= 35)
            toTf++;
         if(temp >= 36 && temp <= 40)
            tsF++;
         if(temp >= 41 && temp <= 45)
            foFf++;
         if(temp >= 46 && temp <= 50)
            fsF++;
      }
      numSet.remove(numCount);
      
      avgNum = total / numSet.size();
      
      System.out.println();
      System.out.println("Avg   :   " + avgNum);
      System.out.println("Range :   " + max + "-" + min);
      //System.out.println("Median:   " + median);
      //System.out.println("Mode  :   " + mode);
      //System.out.println("\nHistogram: );
      
      
      
      
   }
}
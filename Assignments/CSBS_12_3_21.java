/*All 3 methods from this assignment have been completed and compiled here.

FOR FUTURE ME/OTHER READERS

This file contains the following methods in order of top to bottom in code: 
                        e, e, e                        
In this order, I will explain what can be found in each program.

1. collapsePairs
   - 
2. e
   - 
3. e
   -

*/
import java.util.*;
public class CSBS_12_3_21{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int methodNum = 0;
      boolean running = false;
      Random random = new Random();
      
      while(running == false){
         System.out.println("Which method would you like to run?");
         System.out.println("Enter the number matching your selection.");
         System.out.println("1. countWords\n2. countDuplicates ");
         methodNum = input.nextInt();
         input.nextLine();
         
         if(methodNum == 1) { // collapsePairs()
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int userInput[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               userInput[i] = numSet.get(i);
               
            System.out.println("Running collapsePairs(array[])");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            int ans[] = collapsePairs(userInput);
            /*    System.out.print("Input: {" + userInput[0]);
            for(int e = 1; e < arrayLength; e++)
               System.out.print(", " + userInput[e]);
            System.out.print("}\n\n");       */   /////////////////////////////////////
            System.out.print("Output: {" + ans[0]);
            for(int e = 1; e < arrayLength; e++)
               System.out.print(", " + ans[e]);
            System.out.print("}\n\n");
            wait(2000);
         } else if(methodNum == 2) { //   countDuplicates() //////////// UNFINISHED!!!
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int userInput[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               userInput[i] = numSet.get(i);
            
            System.out.println("Running countDuplicates(array[])");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            int ans = countDuplicates(userInput);
            System.out.println("There are " + ans + " duplicates in your array.");
            wait(2000);
         } else if(methodNum == 3) { //e()

            wait(2000);
         }  else {
            System.out.println("Invalid Number. Try again.");
         } 
      }
   }
   public static int[] collapsePairs(int[] n){
      int temp = 0;
      for(int i = 1; i < n.length; i = i+2){
         temp = n[i] + n[i-1];
         if(temp % 2 == 0){
            n[i-1] = temp;
            n[i] = 0;
         }
         else{
            n[i] = temp;
            n[i-1] = 0;
         }
      }
   return n;
   }
   public static int countDuplicates(int[] n){
      int temp = 0;
      int duplicateCount = 1;
      
      
      for(int i = 0; i < n.length; i++){
         temp = n[i];
         for(int e = 0; e < n.length; e++){
            if(temp == n[e] && e > i)
               duplicateCount = 1;
         }
      }
      return duplicateCount;
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

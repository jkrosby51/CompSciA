/*All 3 methods from this assignment have been completed and compiled here.

FOR FUTURE ME/OTHER READERS
                     
---Each method and it's description---

1. collapsePairs
   - condenses pairs of two numbers in an array into one number and sorts by even/odd.
2. countDuplicates
   - checks how many duplicate numbers are in a given array.
3. contains
   - checks if a2 can be found within a1.
4. kMostFrequent
   - Shows which number is most frequently found in an array.
5. isMonotonic

6. numUnique

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
         System.out.println("1. countWords \n2. countDuplicates \n3. contains \n4. kMostFrequent \n5. isMonotonic \n6. numUnique");
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
         } else if(methodNum == 2) { //   countDuplicates()
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
         } else if(methodNum == 3) { //contains()
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            System.out.println("Enter the first array.");
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int a1[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               a1[i] = numSet.get(i);

            ArrayList<Integer> numSet2 = new ArrayList<Integer>();
            temp = 0;
            System.out.println("Enter the second array.");
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet2.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            arrayLength = numSet2.size();
            int a2[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               a2[i] = numSet2.get(i);
            
            System.out.println("Running contains(a1 a2)");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            boolean ans = contains(a1, a2);
            if(ans == true)
               System.out.println("a2 can be found within a1.\n");
            else
               System.out.println("a2 can not be found within a1.\n");
            
            wait(2000);
         } else if(methodNum == 4){ //kMostFrequent()
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            System.out.println("Enter an array of numbers.");
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int a[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               a[i] = numSet.get(i);
               
            System.out.print("How many numbers would you like to recieve? ");
            int k = input.nextInt();
         
            System.out.println("Running kMostFrequent(a, k)");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            int[] ans = kMostFrequent(a, k);
            System.out.print("{" + ans[0]);
            for(int i = 1; i < ans.length; i++)
               System.out.print(", " + ans[i]);
            System.out.println("}");
            
            wait(2000);
         } else if(methodNum == 5){
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            System.out.println("Enter an array of numbers.");
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int a[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               a[i] = numSet.get(i);
            
            System.out.println("Running isMonotonic(array[])");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            boolean ans = isMonotonic(a);
            System.out.print("isMonotonic = " + ans + ".");
            
            wait(2000);
         } else if(methodNum == 6) {                   // numUnique
            ArrayList<Integer> numSet = new ArrayList<Integer>();
            int temp = 0;
            System.out.println("Enter a sorted array of numbers.");
            for(int i = 0; temp != -1; i++){
               System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
               temp = input.nextInt();
         
               if(temp >= 1 && temp <= 50){
                     numSet.add(temp);
               }else if(temp != -1)
                  System.out.println("Only values between 1 and 50 are counted.");
            }  
            int arrayLength = numSet.size();
            int a[] = new int[arrayLength];
            for(int i = 0; i < arrayLength; i++)
               a[i] = numSet.get(i);
            
            System.out.println("Running numUnique(array[])");
            int rndmNum = random.nextInt(8 - 4) + 1;
            for(int e = 0; e <= rndmNum; e++){
               System.out.print(". ");
               wait(random.nextInt(750 - 400) + 1);
            }
            System.out.println("\n");
            int ans = numUnique(a);
            System.out.print("There are " + ans + " unique numbers in the array.");
            
            wait(2000);
         } else {
            System.out.println("Invalid Number. Try again.");
         
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
      int duplicateCount = 0;
      int tempNegative = 0;
      boolean[] checked = new boolean[200];
      
      for(int i = 0; i < n.length; i++){
         temp = n[i];
         tempNegative = temp;
         if(temp < 0)
            tempNegative += 100;

         if(checked[tempNegative] != true){
            for(int e = 0; e < n.length; e++){
               if(temp == n[e] && e > i)
                  duplicateCount++;
            }
         }
         checked[tempNegative] = true;
      }
      return duplicateCount;
   }
   
   public static boolean contains(int[] a1, int[] a2){
      boolean found = false;
      int counter = 0;
      for(int i = 0; i <= a1.length - a2.length && found == false; i++){
         counter = 0;
         //System.out.println("");
         for(int e = 0; e < a2.length ; e++){
            if(a1[i+e] == a2[e])
               counter++;
            if(counter == a2.length)
               found = true;
            //System.out.println("counter: " + counter + "    e: " + e + "    a1: " + a1[i+e]);
         }
      }
      return found;  
   }
   
   public static int[] kMostFrequent(int[] a, int k){ //BROKEN!!!!!!!!!!!
      int[] ans = new int[k];
      int temp = 0;
      int[] checked = new int[100];
      
      for(int i = 0; i < k; i++){
         for(int e = 0; e < a.length; e++){
            if(a[e] > 0)
               temp = a[e];
            else
               temp = (a[e] + 50);
            
            checked[temp]++;
         }
         temp = 0;
         for(int e = 0; e < checked.length; e++){
            if(checked[e] > temp)
               temp = e; 
         }
         ans[i] = a[temp];
      }        
      return ans;
   }
   
   public static boolean isMonotonic(int[] a){
      boolean ans = true;
      boolean up = false;
      
      if(a.length < 2)
         return true;
      
      if(a[1] > a[0])
         up = true;
      else if(a[1] == a[0]){
         if(a[2] > a[1])
            up = true;
      }
      if(up == true){
         for(int i = 1; i < a.length; i++){
            if(a[i] < a[i-1])
               ans = false;
         }
      } else if (up == false){
        for(int i = 1; i < a.length; i++){
            if(a[i] > a[i-1])
               ans = false;
         } 
      }
       
      return ans;
   }
   
   public static int numUnique(int[] a){
      int ans = 1;
      
      if(a.length < 2)
         return a.length;
      
      for(int i = 1; i < a.length; i++){
         if(a[i] != a[i-1])
            ans++;
      }
      
      return ans;
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

//
//First line works, other lines don't
//Spaces Work
//Errors in Line 44
//

import java.util.*;
public class Parkside{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int size;
      int seed;
      int temp = 0;
      int numVals = 0;
      int temp2 = 0;
      int temp3 = 0;
      int e = 0;
      int stop = 0;
      String spaces;
      
      System.out.print("Enter a size (between 1-9): ");
      size = input.nextInt() + 1;
      System.out.print("Enter a seed (between 1-9): ");
      seed = input.nextInt();
      
      int[] firstLine = new int[size];
      
      for(int k = 1; k <= size; k++){
         numVals += k;
      }
      
      String[] lineOutput = new String[size];
      
      temp2 = seed;
      for(int i = 1; i < size; i++){
         for(int j = 1; j < (size - i + 1); j++){
            if(stop == 0){
               System.out.print(temp2);
               firstLine[j-1] = temp2;
               temp2 += (j-i);
               if(temp2 > 9){temp2 = 1;}
               temp2++;
               if(temp2 > 9){temp2 = 1;} 
            }
         }
         stop = 1;
         System.out.println("");
         System.out.format("%" + i +"s", "");
         for(e = i; e < (size - e + (size - 2)); e++){
            firstLine[e]++;
            if(firstLine[e] > 9){firstLine[e] = 1;}
            System.out.print(firstLine[e]);
            //firstLine[e] = temp3; 
         }
      }
   }         
}



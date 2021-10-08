import java.util.*;
public class Parkside{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int size;
      int seed;
      int temp = 0;
      String spaces;
      
      System.out.print("Enter a size (between 1-9): ");
      size = input.nextInt();
      System.out.print("Enter a seed (between 1-9): ");
      seed = input.nextInt();
      
      String[] lineOutput = new String[size];
      
      for(int i = 0; i < size ; i++){
         for(int j = size; j >= 0; j--){
         temp = seed;
            if(temp <= 9){
               spaces = new String(new char[i]).replace("\0", " ");
               lineOutput[i] = (spaces + String.valueOf(temp));
               System.out.println(lineOutput[i]);
               temp = temp * 
            }
            else{temp = 1;}
         }
      }
      
      
   }
}
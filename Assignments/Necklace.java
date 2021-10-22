import java.util.*;
public class Necklace{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num1 = 0;
      int num2 = 0;
      int counter = 0;
      boolean met = false;
      int[] necklace = new int[100];
      
      System.out.print("Enter an integer: ");
      num1 = input.nextInt();
      System.out.print("Enter another integer: ");
      num2 = input.nextInt();
      
      necklace[0] = num1;
      necklace[1] = num2;
      System.out.print("" + necklace[0] + necklace[1]); 
      
      for(int i = 2; met == false; i++){
         necklace[i] = ((necklace[i-2] + necklace[i-1])/1) % 10;
         System.out.print(necklace[i]);
         if(i > 2){
            if(necklace[i-1] == necklace[0] && necklace[i] == necklace[1]){
               met = true;
            }
         }
         counter = i - 1;
      }
      System.out.println("\nThe necklace took " + counter + " steps to complete itself.");
   }
}
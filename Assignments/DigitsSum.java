import java.util.*;
public class DigitsSum{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int userInput;
      int[] digits = new int[10];
      int sum = 0;
      
      System.out.println("Enter a positive integer: ");
      userInput = input.nextInt();
      
      //int inputLength = String.valueOf(userInput).length();
      String inputString = String.valueOf(userInput);
      for(int i = 0; i < inputString.length(); i++) {
         int j = Character.digit(inputString.charAt(i), 10);
         digits[i] = j;
         //System.out.println("#" + (i+1) + ": " + digits[i]); 
      }
      for (int value : digits) {
         sum += value;
      }
      System.out.println("The Sum of the cubes of the digits is: " + sum);
   }
}
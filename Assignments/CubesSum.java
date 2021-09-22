import java.util.*;
public class CubesSum{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int userInput;
      int sum = 0;
      int[] digits = new int[10];
      int[] digitsCubed = new int[10];
      
      System.out.println("Enter a positive integer: ");
      userInput = input.nextInt();
      
      //int inputLength = String.valueOf(userInput).length();
      String inputString = String.valueOf(userInput);
      for(int i = 0; i < inputString.length(); i++) {
         int j = Character.digit(inputString.charAt(i), 10);
         digits[i] = j;
         //System.out.println("Digits: " + digits[i]);
      }
      
      for(int i = 0; i < digits.length; i++) {
         int k = digits[i] * digits[i] * digits[i];
         digitsCubed[i] = k;
      }
      
      for (int value : digitsCubed) {
        sum += value;
      }
      System.out.println("The Sum of the cubes of the digits is: " + sum);
   }
}
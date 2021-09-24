import java.util.*;
public class DigitsDisplay{

   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int userInput;
      int[] digits = new int[10];
      
      System.out.println("Enter a positive integer: ");
      userInput = input.nextInt();
      
      //int inputLength = String.valueOf(userInput).length();
      String inputString = String.valueOf(userInput);
      for(int i = 0; i < inputString.length(); i++) {
         int j = Character.digit(inputString.charAt(i), 10);
         digits[i] = j;
         //if(digits[i] == 0 && digits [i+1] == 0 && digits[i+2] == 0){}
         //else{ 
            System.out.println("#" + (i+1) + ": " + digits[i]); 
         //}
      }
   }
}
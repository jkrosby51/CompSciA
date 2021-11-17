import java.util.*;
public class Palindrome{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String userInput = "";
      String lowerCase = "";
      int length = 0;
      String opposite = "";
      String original = "";
      
      System.out.print("Enter a String:");
      userInput = input.nextLine();
      
      length = userInput.length();
      char[] letters = new char[length];
      lowerCase = userInput.toLowerCase();
      
      for(int i = 0; i < length; i++){
         letters[i] = lowerCase.charAt(i);
      }
      for(int i = 0; i < length ; i++){
         if(Character.isWhitespace(letters[i])){    
         } else {
            original += letters[i];
         }
      }
      for(int i = length - 1; i >= 0; i--){
         if(Character.isWhitespace(letters[i])){    
         } else {
            opposite += letters[i];
         }
      }
      System.out.println(original);
      System.out.println(opposite);
      
      if(opposite.equals(original) == true)
         System.out.println("\"" + userInput + "\" is a palindrome.");
      else
         System.out.println("\"" + userInput + "\" is not a palindrome.");
   }
}
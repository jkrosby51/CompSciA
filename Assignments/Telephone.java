import java.util.*;
public class Telephone{

   public static void main(String[] args){
      char userInput;
      int correctDigit = 0;
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter a single uppercase letter: ");
      userInput = input.next().charAt(0);
      //System.out.println("." + userInput + ".");
      if(userInput == 'A' || userInput == 'B' || userInput == 'C'){
         correctDigit = 2;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'D' || userInput == 'E' || userInput == 'F'){
         correctDigit = 3;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'G' || userInput == 'H' || userInput == 'I'){
         correctDigit = 4;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'J' || userInput == 'K' || userInput == 'L'){
         correctDigit = 5;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'M' || userInput == 'N' || userInput == 'O'){
         correctDigit = 6;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'P' || userInput == 'Q' || userInput == 'R' || userInput == 'S'){
         correctDigit = 7;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'T' || userInput == 'U' || userInput == 'V'){
         correctDigit = 8;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else if(userInput == 'W' || userInput == 'X' || userInput == 'Y' || userInput == 'Z'){
         correctDigit = 9;
         System.out.println("The digit " + correctDigit + " corresponds to the letter " + userInput + " on the telephone.");
      } else {
         System.out.println("You must input an uppercase alphabetical character");
      }
   }
}
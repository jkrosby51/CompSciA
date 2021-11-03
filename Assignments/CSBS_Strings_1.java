import java.util.*;
public class CSBS_Strings_1 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int methodNum = 0;
      boolean running = false;
      
      
      while(running == false){
         System.out.println("Which method would you like to run?");
         System.out.println("Enter the number matching your selection.");
         System.out.println("1 = countWords \n2 = '   '");
         methodNum = input.nextInt();
         
         if(methodNum == 1){
            System.out.println("What String would you like to count in countWords().");
            String val = input.nextLine();
            System.out.println("Running countWords(\"" + val + "\")...\n");
            String ans = countWords(val);
            System.out.println("\"" + val + "\" contains " + ans + " words.");
         } else {
            System.out.println("Invalid Number. Try again.");
         }
      }  
   }
   
   public static String countWords(String n){
      int wordCount = 0;
      char temp = 'A';
      
      int length = n.length();
      boolean[] letterCheck = new boolean[length];
      
      for(int i = 0; i < length; i++){
         temp = n.charAt(i);
         letterCheck[i] = temp.isLetter();
         System.out.println("charAt(" + i + ") == " + temp + ".");
         System.out.println("letterCheck[" + i + "] == " + letterCheck[i] + ".");
      }
      String ans = wordCount.toString();
      return(ans);
   }
}
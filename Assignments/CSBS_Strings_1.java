/*All 5 methods from this assignment have been completed and compiled here.

FOR FUTURE ME/OTHER READERS

This file contains the following methods in order of top to bottom in code: 
                        isRotation, swapPairs, toRomanNumeral, removeAll, countWords
                        
In this order, I will explain what can be found in each program.

1. isRotation
   - moves characters from beginning to end of string repeatedly
2. swapPairs
   - splits string into pairs of 2 characters each and flips each pair over.
3. toRomanNumeral
   - Uses HashMap which maps variables of different types
   - uses modulus to single out specific parts of an integer
4. removeAll
   - splits string into char array
   - checks each entry in array to see if it matches with a given char
5. countWords
   - checks each character in a string
   - compares current and past char being checked to see if the word ended


*/
import java.util.*;
public class CSBS_Strings_1 {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int methodNum = 0;
      boolean running = false;
      
      
      while(running == false){
         System.out.println("Which method would you like to run?");
         System.out.println("Enter the number matching your selection.");
         System.out.println("1. countWords \n2. removeAll \n3. toRomanNumeral \n4. swapPairs \n5. isRotation");
         methodNum = input.nextInt();
         input.nextLine();
         
         if(methodNum == 1) { //countWords()
            System.out.println("Enter the String you would like to count in countWords():");
            String val = input.nextLine();
            
            System.out.println("Running countWords(\"" + val + "\")...\n");
            int ans = countWords(val);
            System.out.println("\"" + val + "\" contains " + ans + " words.\n");
            wait(2000);
         } else if(methodNum == 2) { //removeAll() 
            System.out.print("Enter the String you would like to edit: ");
            String val = input.nextLine();
            System.out.print("Enter the letter you would like to remove from the string: ");
            char removeThis = input.next().charAt(0);
            
            System.out.println("Running removeAll(\"" + val + "\", '" + removeThis + "')...\n");
            String ans = removeAll(val, removeThis);
            System.out.println("\"" + val + "\" without '" + removeThis + "' \nis \"" + ans + ".\"\n");
            wait(2000);
         } else if(methodNum == 3) { //toRomanNumeral()
            System.out.print("Enter an Integer: ");
            int val = input.nextInt();
            
            System.out.println("Running toRomanNumeral(" + val + ")...\n");
            String ans = toRomanNumeral(val);
            System.out.println("The Roman Numeral of " + val + " is " + ans + ".\n");
            wait(2000);
         } else if(methodNum == 4) { //swapPairs()
            System.out.println("Enter the String you would like to edit in swapPairs():");
            String val = input.nextLine();
            
            System.out.println("Running swapPairs(\"" + val + "\")...\n");
            String ans = swapPairs(val);
            System.out.println("swapPairs(\"" + val + "\") returns: \"" + ans + ".\"\n");
            wait(2000);
         } else if(methodNum == 5){ //isRotation
            System.out.println("Enter the first String you would like to check in isRotation():");
            String val = input.nextLine();
            System.out.println("Enter the second String you would like to check in isRotation():");
            String potentialRotation = input.nextLine();
            
            System.out.println("Running isRotation(\"" + val + "\", \"" + potentialRotation + "\")...\n");
            boolean ans = isRotation(val, potentialRotation);
            if (ans == true)
               System.out.println("\"" + val + "\", \"" + potentialRotation + "\" are rotations of eachother.\n");
            else if(ans == false)
               System.out.println("\"" + val + "\", \"" + potentialRotation + "\" are not rotations of eachother.\n");
            wait(2000); 
         } else {
            System.out.println("Invalid Number. Try again.");
         }
         
      }  
   }
   public static boolean isRotation(String n, String m){
      boolean ans = false;
      int lengthN = n.length();
      int lengthM = m.length();
      int count = 0;
      String tempVal = "";
      String[] mVals = new String[lengthM];
       
      
      if(n.equals(m)){
         ans = true;
      } else if(lengthN != lengthM){
            ans = false;
      } else {
         for(int i = 0; i < lengthM; i++){
            mVals[i] = Character.toString(m.charAt(i));
         }
         while(count < lengthM * 2){
            tempVal = "";
            for(int i = 0; i < lengthM - 1; i++){
               tempVal += mVals[i + 1];
            }
            tempVal += mVals[0];
            for(int i = 0; i < lengthM; i++){
               mVals[i] = Character.toString(tempVal.charAt(i));
            }
            count++;
            if(tempVal.equals(n))
               ans = true;
            //System.out.println(tempVal);
         }
      }
      //System.out.println("ans = " + ans);
      return(ans);
   }
   
   public static String swapPairs(String n){
      String ans = "";
      int length = n.length();
      int i = 1;
      
      while(i < length) {
         ans += n.charAt(i);
         i--;
         
         ans += n.charAt(i);
         i = i + 3;
      }
      if (length % 2 != 0)
         ans += n.charAt(length - 1);
      return(ans);
   }

   
   public static String toRomanNumeral(int n){
      String ans = "";
      int temp = 0;
      int temp2 = 0;
      boolean temp3 = false;
      int temp4 = 1;
      int multiple = 0;
      int count = 0;
      
      Map<Integer, String> map
            = new HashMap<Integer, String>();
  
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
      
      String inputN = Integer.toString(n);
      int length = inputN.length();
      String[] numerals = new String[length];
      if (map.get(n) != null){
          ans = map.get(n);
      }
      else if((n % 10) == 0){
         temp4 = n;
         for(multiple = 10; temp4 > 0; multiple *= 10){
            System.out.println(temp4);
            temp2 = temp4;
            temp4 = n / multiple;
         }
         multiple /= 100;
         for(int i = temp2; i > 0; i--){
            System.out.println(multiple);
            ans = map.get(multiple) + ans;
         }
      
      }
      else{
          for(int i = 10; count < length; i *= 10){
             temp = (n % i) - (n % (i / 10)); 
             if((temp / (i / 10)) != 1 && (temp / (i / 10)) != 4 && (temp / (i / 10)) != 9){
               temp2 = temp / (i / 10);
               System.out.println("temp2 = " + temp2);
                if(temp2 >= 5){
                  temp2 -= 5;
                  temp3 = true;
                }
                temp = temp / (temp / (i / 10));
                while(temp2 > 0){
                   System.out.println(temp);
                   ans = map.get(temp) + ans;
                   temp2--;
                }
                if(temp3 == true){
                  ans = map.get(5*(i/10)) + ans;
                  temp3 = false;
                  }
                
             } else {
                System.out.println(temp);
                ans = map.get(temp) + ans;
             }
         
         count++;
          }
      }
      if(n < 1)
         ans = "Your input must be greater than 0";
      else if(n > 3999)
         ans = "Your input must be less than 4000";
      
      return(ans);
   }
   
   public static String removeAll(String n, char m){
      String ans = "";
      int length = n.length();
      boolean[] letterCheck = new boolean[length];
      
      for(int i = 0; i < length; i++){
         if(n.charAt(i) == m)
            letterCheck[i] = true;
         else
            letterCheck[i] = false;
         //System.out.println("charAt(" + i + ") == " + n.charAt(i) + ".");
         //System.out.println("letterCheck[" + i + "] == " + letterCheck[i] + ".");
         if(letterCheck[i] == false)
            ans += n.charAt(i);
            
      }
      return(ans);
   }
   
   public static int countWords(String n){
      int wordCount = 0;
      char temp = 'A';
      
      int length = n.length();
      boolean[] letterCheck = new boolean[length];
      
      for(int i = 0; i < length; i++){
         letterCheck[i] = Character.isLetter(n.charAt(i));
         //System.out.println("charAt(" + i + ") == " + n.charAt(i) + ".");
         //System.out.println("letterCheck[" + i + "] == " + letterCheck[i] + ".");
         if(i > 0){
            if (letterCheck[i] == false && letterCheck[i-1] == true || letterCheck[length - 1] == true)
               wordCount++;
         }
      }
      //String ans = Integer.toString(wordCount);
      return(wordCount);
   }
   
   public static void wait(int ms)
   {
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
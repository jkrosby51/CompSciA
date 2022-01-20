import java.util.*;
public class Convert
{
   Scanner input = new Scanner(System.in);
   String num1, num2, num3, operation;
   int base1, base2, base3, firstNum, secondNum, thirdNum;
   
   public int returnVal(char in){
      if(in >= '0' && in <= '9')
         return in - 48;
      else
         return in - 55;
   }
   
   public int convertToBase10(int base, String number) // converts base x to base 10
   {
      int power = 1;
      int result = 0;
      for(int i = number.length() - 1; i >= 0; i--){
         result += (returnVal(number.charAt(i)) * power);
         power = base * power;
      }   
      return result;
   }
   public String convertToBaseVar(int base, int number) // converts base 10 to base x
   {
      String result = "";
      int temp = 0;
      char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
      while(number > 0)  
      {  
         temp = number % base;   
         result = hex[temp] + result;   
         number = number / base;  
      }  
      return result;
   }

   public void getInfo()
   {
      while(base1 > 16 || base1 < 2){
         System.out.print(" Enter the base of the first number : ");
         base1 = input.nextInt();
         input.nextLine();
         if(base1 > 16 || base1 < 2)
               System.out.println("Invalid Input");
      }
      System.out.print(" Enter the first number : ");
      num1 = input.nextLine();
      while(base2 > 16 || base2 < 2){
         System.out.print("\n Enter the base of the second number : ");
         base2 = input.nextInt();
         input.nextLine();
         if(base2 > 16 || base2 < 2)
               System.out.println("Invalid Input");
      }
      System.out.print(" Enter the second number : ");
      num2 = input.nextLine();
      firstNum = convertToBase10( base1, num1);
      secondNum = convertToBase10( base2, num2);
   
      //System.out.println("  firstNum: " + firstNum + "\n  secondNum: " + secondNum);
      boolean badOperation = true;
      while(badOperation == true){
         System.out.print("\n Enter the operation: ");
         operation = input.nextLine();
         badOperation = false;
         if(operation.equals("+"))
            thirdNum = firstNum + secondNum;
         else if(operation.equals("-"))
            thirdNum = firstNum - secondNum;
         else if(operation.equals("*") || operation.equals("x"))
            thirdNum = firstNum * secondNum;
         else if(operation.equals("/"))
            thirdNum = firstNum / secondNum;
         else {
            System.out.println("This is not a valid operation");
            badOperation = true;
         }
      }
         while(base3 > 16 || base3 < 2){
            System.out.print("\n Enter the base of the result: ");
            base3 = input.nextInt();
            input.nextLine();
            if(base3 > 16 || base3 < 2)
               System.out.println("Invalid Input");
      }
      
      num3 = convertToBaseVar(base3, thirdNum);
      
      System.out.println("\n " + num1 + " { " + firstNum + " } " + operation + " " + num2 + " { " + secondNum + " } = " + num3 + " { " + thirdNum + " } ");
   }

   public static void main(String[] args)
   {
      Convert temp = new Convert();
      temp.getInfo();
   }

}
import java.util.*;
public class FizzBuzz{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int newLine = 20;
      int maxVal = 0;
      int startVal = 1;
      int fizz = 3;
      int buzz = 5;
      int count = 0;
           
      System.out.print("Max value? ");
      maxVal = input.nextInt();
      
      for(int i = startVal; i <= maxVal; i++){
         if(count == 20){
            System.out.println("");
            count = 0;
         }
         if(i % fizz == 0 && i % buzz == 0)
            System.out.print("FizzBuzz ");
         else if(i % buzz == 0)
            System.out.print("Buzz ");
         else if(i % fizz == 0)
            System.out.print("Fizz ");
         else
            System.out.print(i + " ");
         count++;
      }
   }
}
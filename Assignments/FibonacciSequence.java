import java.util.*;
public class FibonacciSequence{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int temp1 = 0;
      int temp2 = 1;
      int temp3 = 0;
      int max = 0;
      
      System.out.println("This program lists the Fibonacci sequence.");
      System.out.print("Max value? ");
      max = input.nextInt();
      System.out.print("0");
      while(temp2 <= max){
         temp3 = temp2;
         temp2 = temp1 + temp2;
         temp1 = temp3;
         System.out.print(", " + temp3);
      }
   }
}
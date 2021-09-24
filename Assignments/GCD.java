import java.util.*;
public class GCD{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num1 = 0;
      int num2 = 0;
      int temp = 0;
      
      System.out.print("Enter a positive number: ");
      num1 = input.nextInt();
      System.out.print("Enter another positive number: ");
      num2 = input.nextInt();
      
      while (num2 > 0){
         temp = num1 % num2;
         num1 = num2;
         num2 = temp;
      }
      //System.out.println(The GCD is " + 
      System.out.println("The GCD is " + num1);
   }
}
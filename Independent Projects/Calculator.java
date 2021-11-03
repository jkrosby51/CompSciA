import java.util.*;
public class Calculator{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String userInput = "";
      int i = 0;
      String calc = "";
      int answer = 0;
      
      System.out.println("Welcome to the calculator! \nType '1' to begin, or '2' for help.");
      userInput = input.nextLine();
      
      while(i == 0){
         while(!userInput.equals("1") && !userInput.equals("2")){
            System.out.println("\nPlease enter either '1' or '2' to continue.");
            userInput = input.nextLine();
         }
         if(userInput.equals("1")){
            System.out.println("Type your question using the correct formatting (found by typing '2' in the menu)");
            calc = input.nextLine();
            answer = Calculate(calc);
         } else if(userInput.equals("2")){
            System.out.println("---------Guide---------");
            System.out.println("This application can be used for many types of calculations, \n" +
               "Here are examples for formatting your text, replace variables with your numbers:");
            System.out.println("x+y\nx-y\nx*y\nx/y\nx%y\nx^y\nsqrt(x)\n" +
               "Example: ((3+4)*(8-sqrt(4))^4)%8");
            System.out.println("Don't place any spaces.");
            userInput = "";
         }
      }
   }
   public static int Calculate(String calc){
   int answer = 0;
   
   return(answer);   
   } 
}
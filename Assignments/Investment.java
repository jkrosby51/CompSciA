import java.util.*;
public class Investment{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      double initial = 2500;
      double goal = 5000;
      double rate = 0.075;
      int years = 0;
      
      System.out.print("Enter your initial investment: ");
      initial = input.nextDouble();
      System.out.print("Enter your goal: ");
      goal = input.nextDouble();
      System.out.print("Enter your compound rate in decimal form: ");
      rate = input.nextDouble();
      
      
      for(int i = 0; initial < goal; years++){
         initial += (initial * rate);
      }
      
      System.out.println("It would take " + years + " years to reach your goal.");
      
      
      
   }
}
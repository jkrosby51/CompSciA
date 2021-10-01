import java.util.*;
public class Monogram{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      char initial1;
      char initial2;
      char initial3;
      
      System.out.print("Enter your first name: ");
      initial1 = Character.toLowerCase(input.next().charAt(0));   
      System.out.print("Enter your midle initial: ");
      initial2 =  Character.toLowerCase(input.next().charAt(0));
      System.out.print("Enter your last name: ");
      initial3 =  Character.toUpperCase(input.next().charAt(0));
      
      System.out.println("" + initial1 + initial3 + initial2);
   }  
}
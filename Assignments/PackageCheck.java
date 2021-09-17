import java.util.*;
public class PackageCheck{

   public static void main(String[] args){
      int kilos;
      int lengthCm;
      int widthCm;
      int heightCm;
      int cubicCm;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter package weight in kilograms: ");
      kilos = input.nextInt();
      System.out.print("Enter package length in centimeters: ");
      lengthCm = input.nextInt();
      System.out.print("Enter package width in centimeters: ");
      widthCm = input.nextInt();
      System.out.print("Enter package height in centimeters: ");
      heightCm = input.nextInt();
      
      cubicCm = lengthCm * widthCm * heightCm;
      
      
      if (kilos > 27 && cubicCm > 100000){
      System.out.println("Too heavy and too large.");
      } else if (kilos > 27){
      System.out.println("Too heavy.");
      } else if (cubicCm > 100000){
      System.out.println("Too large.");
      } else {
      System.out.println("Appropriate weight and size");
      }
   }
}
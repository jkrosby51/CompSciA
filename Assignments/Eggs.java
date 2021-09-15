import java.util.*;
public class Eggs{

   public static void main(String[] args){
      int eggsPurchased;
      int eggsDozen;
      int eggsExtra;
      double pricePerDozen = 0;
      double pricePerExtra = 0;
      double totalPrice;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of eggs purchased: ");
      eggsPurchased = input.nextInt();
      
      eggsDozen = eggsPurchased / 12;
      eggsExtra = eggsPurchased % 12;
      
      if(eggsDozen >= 0 && eggsDozen < 4){
         pricePerDozen = 0.50;
         pricePerExtra = pricePerDozen / 12;
      }else if(eggsDozen >= 4 && eggsDozen < 6){
         pricePerDozen = 0.45;
         pricePerExtra = pricePerDozen / 12;
      }else if(eggsDozen >= 6 && eggsDozen < 11){
         pricePerDozen = 0.40;
         pricePerExtra = pricePerDozen / 12;
      }else if(eggsDozen >= 11){
         pricePerDozen = 0.35;
         pricePerExtra = pricePerDozen / 12;
         
      }
      totalPrice = (eggsDozen * pricePerDozen) + (eggsExtra * pricePerExtra);
         System.out.println("The bill is equal to: $" + totalPrice);
   }
}
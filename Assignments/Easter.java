import java.util.*;
public class Easter{
   
   public static void main(String[] args){
      int year;
      int a;
      int b;
      int c;
      int d;
      int e;
      int easterDay;
      int[] weirdYears = {1954, 1981, 2049, 2076};
      
      Scanner input = new Scanner(System.in);
   
      System.out.print("Enter a year between 1900-2099: ");
      year = input.nextInt();
      
      a = year % 19;
      b = year % 4;
      c = year % 7;
      d = (19 * a + 24) % 30;
      e = (2 * b + 4 * c + 6 * d + 5) % 7;
      easterDay = 22 + d + e;
      
      
      if (Arrays.asList(weirdYears).contains(year)){
         easterDay =- 7;
         if(easterDay <= 30){
            System.out.println("Easter Sunday in " + year + " is March " + easterDay + ".");
         }
         else{
            System.out.println("Easter Sunday in " + year + " is April " + (easterDay - 31) + ".");
         }
      }
      else{
         if(easterDay <= 30){
            System.out.println("Easter Sunday in " + year + " is March " + easterDay + ".");
         }
         else{
            System.out.println("Easter Sunday in " + year + " is April " + (easterDay - 30) + ".");
         }
      }
   }
}
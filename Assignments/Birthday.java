import java.util.*;
public class Birthday{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int dayNum;
      int monthNum;
      int longYearNum;
      int yearNum;
      int total;
      int totalRemainder;
      int[] monthValue = new int[12];
      String[] remainderValue = new String[7];
      int leapYear = 0;
      
      System.out.println("Enter any date within the 1900s using numbers: ");
      System.out.print("Day of the month: ");
      dayNum = input.nextInt();
      System.out.print("Month: ");
      monthNum = input.nextInt();
      System.out.print("Year: ");
      longYearNum = input.nextInt();
      if (longYearNum < 1900 || longYearNum > 2000){ System.out.println("That year is not in this century.");}
      yearNum = (longYearNum % 100);
      
      monthValue[0] = 1;
      monthValue[1] = 4;
      monthValue[2] = 4;
      monthValue[3] = 0;
      monthValue[4] = 2;
      monthValue[5] = 5;
      monthValue[6] = 0;
      monthValue[7] = 3;
      monthValue[8] = 6;
      monthValue[9] = 1;
      monthValue[10] = 4;
      monthValue[11] = 6;
      
      remainderValue[0] = "Saturday";
      remainderValue[1] = "Sunday";
      remainderValue[2] = "Monday";
      remainderValue[3] = "Tuesday";
      remainderValue[4] = "Wednesday";
      remainderValue[5] = "Thursday";
      remainderValue[6] = "Friday";
      
      if(longYearNum / 4 == 0 && longYearNum / 100 != 0 || longYearNum / 400 == 0){
         leapYear = 1;
      } else { leapYear = 0; }
      
      total = yearNum / 4;
      total += (yearNum + dayNum);
      total += monthValue[(monthNum-1)];
      if(leapYear == 1){
         if(monthNum == 1 || monthNum == 2){
            total -= 1;
         }
      }
      totalRemainder = total % 7;
      
      System.out.println("The date you entered lies on a " + remainderValue[totalRemainder] + ".");       
   }
}
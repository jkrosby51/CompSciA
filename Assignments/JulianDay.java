import java.util.*;
public class JulianDay{

   public static void main (String[] args){
      Scanner input = new Scanner(System.in);
      int julianDay;
      int dayOfWeekNum;
      String[] dayOfWeekName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
      
      System.out.print("Enter a Julian day number: ");
      julianDay = input.nextInt();
      dayOfWeekNum = (julianDay + 1) % 7;
      //System.out.println("dayOfWeekNum: " + dayOfWeekNum);
      System.out.println("Julian day number " + julianDay + " is a " + dayOfWeekName[dayOfWeekNum] + ".");
   }
}
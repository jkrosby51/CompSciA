import java.util.*;
public class Sleep{
    
    public static void main(String[] arg){
        
        int bYear; //birth year
        int bMonth;
        int bDay;
        int cYear; //current year
        int cMonth;
        int cDay;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthdate:");
        System.out.print("Year: ");
        bYear = input.nextInt();
        System.out.print("Month: ");
        bMonth = input.nextInt();
        System.out.print("Day: ");
        bDay = input.nextInt();
        System.out.println("Enter today's date:");
        System.out.print("Year: ");
        cYear = input.nextInt();
        System.out.print("Month: ");
        cMonth = input.nextInt();
        System.out.print("Day: ");
        cDay = input.nextInt();
        
        //-- Following cmments were for debugging --
        //System.out.println("cmonth" + cMonth + "bmonth" + bMonth);  
        //System.out.println("cyear" + cYear + "byear" + bYear);
        //System.out.println("cday" + cDay + "cmonth" + bDay);
        
        int yearsPassed = cYear - bYear;
        int monthsPassed = cMonth - bMonth;
        int daysPassed = cDay - bDay;
        
        daysPassed =+ (yearsPassed * 365) + (monthsPassed * 30);
        int hoursPassed = daysPassed * 24;
        int timeSlept = hoursPassed / (24 / 8);
        
        System.out.println("\n You have been alive for: " + daysPassed + " days.");
        System.out.println("You have been alive for: " + hoursPassed + " hours.");
        System.out.println("You have slept for: " + timeSlept + " hours.");
        
        
        
        
    }
}
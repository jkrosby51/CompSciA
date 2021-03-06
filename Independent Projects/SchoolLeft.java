//
//Add a manual week remover (for vacations and such)
//add a current to end if statement
//        
import java.util.*;
public class SchoolLeft{
    
    public static void main(String[] arg){
        
        int sOrC; //from start to end or from current to end
        int sYear; //start year
        int sMonth;
        int sDay;
        int cYear; //current year
        int cMonth;
        int cDay;
        int eYear; //end year
        int eMonth;
        int eDay;
        
        String dateOne = new String();
        String dateTwo = new String();
        
        int yearsPassed;
        int monthsPassed;
        int daysPassed;
        int hoursPassed;
    
        double schoolDayBegin; //what hour does the school day start
        double schoolDayEnd; //what hour does the school day end
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to count from the beginning to the end or from the current date to the end?");
        System.out.print("Type '1' for beginning or '2' for current: ");
        sOrC = input.nextInt();
        
        if(sOrC == 1){
            
            System.out.println("When did the school year begin?");
            System.out.print("Year: ");
            sYear = input.nextInt();
            System.out.print("Month: ");
            sMonth = input.nextInt();
            System.out.print("Day: ");
            sDay = input.nextInt();
            System.out.println("When does the school year end?");
            System.out.print("Year: ");
            eYear = input.nextInt();
            System.out.print("Month: ");
            eMonth = input.nextInt();
            System.out.print("Day: ");
            eDay = input.nextInt();
            
            yearsPassed = eYear - sYear;
            monthsPassed = eMonth - sMonth;
            daysPassed = eDay - sDay;
        
            daysPassed =+ (yearsPassed * 365) + (monthsPassed * 30);
            hoursPassed = daysPassed * 24;
            
            dateOne = "" + sMonth + "/" + sDay + "/" + sYear;
            dateTwo = "" + eMonth + "/" + eDay + "/" + eYear;
            System.out.println(daysPassed);
            
        }
        else if (sOrC == 2){
            System.out.println("What is the current date?");
            System.out.print("Year: ");
            cYear = input.nextInt();
            System.out.print("Month: ");
            cMonth = input.nextInt();
            System.out.print("Day: ");
            cDay = input.nextInt();
            System.out.println("When does the school year end?");
            System.out.print("Year: ");
            eYear = input.nextInt();
            System.out.print("Month: ");
            eMonth = input.nextInt();
            System.out.print("Day: ");
            eDay = input.nextInt();
            
            yearsPassed = eYear - cYear;
            monthsPassed = eMonth - cMonth;
            daysPassed = eDay - cDay;
        
            daysPassed =+ (yearsPassed * 365) + (monthsPassed * 30);
            hoursPassed = daysPassed * 24;
            
            dateOne = "" + cMonth + "/" + cDay + "/" + cYear;
            dateTwo = "" + eMonth + "/" + eDay + "/" + eYear;
            System.out.println(daysPassed);
        }
        
        System.out.println("Type the most recent line shown");
        int daysPassed2 = input.nextInt();
        
        
        // -- Find school hours per week --
        System.out.println("Enter School hours: ");
        System.out.print("Enter the hour and minute that school starts in decimal form (24h format): ");
        schoolDayBegin = input.nextDouble();
        System.out.print("Enter the hour and minute that school ends in decimal form (24h format): ");
        schoolDayEnd = input.nextDouble();
        
        double schoolPerDay = schoolDayEnd - schoolDayBegin;
        double schoolPerWeek = schoolPerDay * 5;
        double schoolHourLeftNoVacation;
        schoolHourLeftNoVacation = schoolPerWeek * (daysPassed2 / 7);
        
        
        System.out.println("There is " + schoolHourLeftNoVacation + "hr of classtime between " + dateOne + " and " + dateTwo);
        System.out.println("This does NOT include inconsistent breaks (i.e. Winter Break or Spring Break)");


    }
    
}

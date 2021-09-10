//
//Add a manual week remover (for vacations and such)
//add a current to end if statement
//        
import java.util.*;
public class SchoolLeft{
    
    public static void main(String[] arg){
        
        Boolean sOrC; //from start to end or from current to end
        int sYear; //start year
        int sMonth;
        int sDay;
        int cYear; //current year
        int cMonth;
        int cDay;
        int eYear; //end year
        int eMonth;
        int eDay;
        
        int yearsPassed;
        int monthsPassed;
        int daysPassed;
        int hoursPassed;
        int weeksPassed;
        
        
        
        double schoolDayBegin; //what hour does the school day start
        double schoolDayEnd; //what hour does the school day end
        
        String dateOne;
        String dateTwo;
        
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Do you want to count from the beginning to the end or from now to the end?")
        System.out.print("Type TRUE for start and FALSE for now: ");
        sOrC = input.nextBool();
        
        if(sOrC == TRUE){
            System.out.println("When did the school year start?");
            System.out.print("Year: ");
            sYear = input.nextInt();
            System.out.print("Month: ");
            sMonth = input.nextInt();
            System.out.print("Day: ");
            sDay = input.nextInt();
            System.out.println("When did the school year end?");
            System.out.print("Year: ");
            eYear = input.nextInt();
            System.out.print("Month: ");
            eMonth = input.nextInt();
            System.out.print("Day: ");
            eDay = input.nextInt();
            
            yearsPassed = cYear - bYear;
            monthsPassed = cMonth - bMonth;
            daysPassed = cDay - bDay;
        
            daysPassed =+ (yearsPassed * 365) + (monthsPassed * 30);
            weeksPassed = daysPassed / 7;
            hoursPassed = daysPassed * 24;
            
            dateOne = sMonth + "/" + sDay + "/" + sYear;
            dateTwo = eMonth + "/" + eDay + "/" + eYear;
            
        }
        else if (sOrC == FALSE){
            
        }
        
        // -- Find school hours per week --
        System.out.println("Enter School hours: ");
        System.out.print("Enter the hour and minute that school starts in decimal form (24h format): ");
        schoolDayBegin = input.nextDouble();
        System.out.print("Enter the hour and minute that school ends in decimal form (24h format): ");
        schoolDayEnd = input.nextDouble();
        
        double schoolPerDay = schoolDayEnd - schoolDayBegin;
        double schoolPerWeek = schoolPerDay * 5;
        double schoolHourLeftNoVacation = weeksPassed * schoolPerWeek;
        
        
        System.out.println("There is " + schoolHourLeftNoVacation + " left between " + dateOne + " and " + dateTwo);
        System.out.println("This does NOT include inconsistent breaks (i.e. Winter Break or Spring Break)");


    }
    
}

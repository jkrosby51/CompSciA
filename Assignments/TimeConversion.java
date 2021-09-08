import java.util.*;

public class TimeConversion{
    
    public static void main(String[] arg){
        
        int totalMin;
        int hours;
        int mins;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the time in minutes: ");
        totalMin = input.nextInt();
        hours = totalMin / 60;
        mins = totalMin % 60;
        
        if (mins < 10){
            System.out.println("The time is: " + hours + ":0" + mins);
        }
        else{
            System.out.println("The time is: " + hours + ":" + mins);
        }
        
    }
    
}
//h = 100 - 4.9(t^2) -- equation for height when dropped from 100m for t amount of time.
import java.util.*;
public class ObjectHeight {
    
    public static void main(String[] args){
        double time;
        double height;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time less than 4.5 seconds: ");
        time = input.nextDouble();

        height = 100 - 4.9 * (time*time);
        System.out.println("The height of the object is: " + height);
        


    }
}

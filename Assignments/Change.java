import java.util.*;
public class Change {
    public static void main(String[] arg){
        int changeInput;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the change in cents");
        changeInput = input.nextInt();
        quarters = changeInput / 25;
        dimes = (changeInput - (quarters * 25)) / 10;
        nickels = (changeInput - (quarters * 25) - (dimes * 10)) / 5;
        pennies = (changeInput - (quarters * 25) - (dimes * 10) - (nickels * 5));
        
        System.out.println("Quarters:" + quarters);
        System.out.println("Dimes:" + dimes);
        System.out.println("Nickels:" + nickels);
        System.out.println("Pennies:" + pennies);
    }
}

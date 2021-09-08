//https://stackoverflow.com/a/12763845 -- Used as reference
import java.util.*;
public class Digits {

    public static void main(String[] args){
        int userNum;
        int num1;
        int num2;
        int num3;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number: ");
        userNum = input.nextInt();
        
        num1 = userNum % 10;
        num2 = userNum / 10 % 10;
        num3 = userNum /100 % 10;

        System.out.println("The hundreds-place digit is: " + num3);
        System.out.println("The tens-place digit is: " + num2);
        System.out.println("The ones-place digit is: " + num1);

    }
    
}

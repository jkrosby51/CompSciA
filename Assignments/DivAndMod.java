import java.util.*;

public class DivAndMod {
    
    public static void main(String[] arg){
        int num1;
        int num2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        num1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        num2 = input.nextInt();
        
        System.out.println("\n" + num1 + " / " + num2 + " = " + num1 / num2);
        System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
        System.out.println("\n" + num2 + " / " + num1 + " = " + num2 / num1);
        System.out.println(num2 + " % " + num1 + " = " + num2 % num1);
    }
}
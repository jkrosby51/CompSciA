import java.util.*;
public class PizzaCost{
    
    public static void main(String[] arg){
        //l + r + (m(d*d))
        double totalCost;
        double d; //Diameter
        double l = 0.75; //Labor Cost
        double r = 1.00;//Rent Cost
        double m = 0.05; //Material Cost per inch^2 d
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the diameter of the pizza in inches: ");
        d = input.nextDouble();
        
        totalCost = l + r + (m * (d*d));
        System.out.print("The cost of making the pizza is: " + totalCost);
        
        
        
        
    }
    
} 
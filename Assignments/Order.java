import java.util.*;

public class Order{
    
    public static void main(String[] arg){
        
        double priceBurger = 1.69;
        double priceFries = 1.09;
        double priceSoda = 0.99;
        int numBurgers; // $1,69 per
        int numFries; // $1.09 per 
        int numSodas; // $0.99 per
        double totalPreTax;
        double tax; // 6.5% of total
        double total;
        double tendered;
        double change;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of burgers: ");
        numBurgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        numFries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        numSodas = input.nextInt();
        
        totalPreTax = (priceBurger * numBurgers) + (priceFries * numFries) + (priceSoda * numSodas);
        System.out.println("Total before tax: $" + String.format( "%.2f", totalPreTax));
        tax = totalPreTax * 0.065;
        System.out.println("Tax: $" + String.format( "%.2f", tax));
        total = totalPreTax + tax;
        System.out.println("Final Total: $" + String.format( "%.2f", total));
        
        System.out.print("\nEnter amount tendered: $");
        tendered = input.nextDouble();
        change = tendered - total;
        System.out.println("Change: $" + String.format( "%.2f", change));
        
    }
    
}
import java.util.*;

public class CarRecall{
    
    public static void main(String[] args){
        
        String userModel;
        String[] faultyModels = {"119", "179", "189", "195", "221", "780"};
         
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter the car's model number: ");
        userModel = input.nextLine();
     
        if (Arrays.asList(faultyModels).contains(userModel)) {
            System.out.println("Your car is defective. It must be repaired.");
        }else{
            System.out.println("Your car is not defective.");
        }
    }
}



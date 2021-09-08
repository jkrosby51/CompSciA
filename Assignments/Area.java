import java.util.*;
public class Area {

    public static void main(String[] args){
        int length;
        int width;
        int area;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Length: ");
        length = input.nextInt();
        System.out.print("Enter Width: ");
        width = input.nextInt();

        area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
    
}

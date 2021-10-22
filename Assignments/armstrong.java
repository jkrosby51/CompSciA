import java.util.*;
public class armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userNum;
        
        System.out.print("Enter an integer: ");
        userNum = input.nextInt();
        if(userNum > 0){
            System.out.println(armstrongNumbers(userNum));
        }
    }
    public static String armstrongNumbers(int n){
        Scanner input = new Scanner(System.in);
        int num = 0;
        int large = 0;
        String armNums = "";
        
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
           num=input.nextInt();
           if(num>large)
           {
               large=num;
           }
            if(num<smallest){
               smallest=num;
           }
        }
        System.out.print("small: " + smallest + " large: " + large);

        for(int i = smallest; i < large; i++){ 
        }
     return armNums ;
     }
  }










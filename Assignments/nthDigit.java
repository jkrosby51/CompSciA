import java.util.*;
public class nthDigit{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int n = 0;
      int digitCount = 0;
      int arrayCount = 0;
      int nDiff = 0;
      
      System.out.print("Enter N: ");
      n = input.nextInt();
      int[] nums = new int[n];
      
      for(int i = 0; digitCount < n; i++){
         nums[i] = i;
         if((i > 9 && i < 100) || (i < -9 && i > -100)){
            digitCount += 2;
         } else if ((i > 99 && i < 1000) || (i < -99 && i > -1000)){
            digitCount += 3;
         } else if (i > -10 && i < 10){
            digitCount += 1;
         }
         arrayCount = i;
      }
      nDiff = digitCount - n;
      
      System.out.println((nums[arrayCount] % 10));
            
   }  
}
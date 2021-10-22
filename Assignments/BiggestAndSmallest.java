import java.util.*;
public class BiggestAndSmallest{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int size = 0;
      int temp = 0;
      int bigNum = 0;
      int smallNum = 0;
      
      System.out.print("Number of numbers? ");
      size = input.nextInt();
      int[] nums = new int[size];
      
      for(int i = 0; i < size; i++){
         System.out.print("Number " + (i + 1) + ": ");
         nums[i] = input.nextInt();
      }
      bigNum = nums[0];
      smallNum = nums[0];
      for(int j = 0; j < size; j++){
         temp = nums[j];
         if(bigNum < temp){
            bigNum = temp;
         }
         if(smallNum > temp){
            smallNum = temp;
         }
      }
      System.out.println("Biggest = " + bigNum);
      System.out.println("Smallest = " + smallNum);
   }
}
import java.util.*;
public class RangeOfNumbers{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int start = 0;
      int end = 0;
      int direction = 0;
      int temp = 0;
      
      System.out.print("Start? ");
      start = input.nextInt();
      System.out.print("End? ");
      end = input.nextInt();
      
      if(end - start == 0){
         System.out.println(start);
      } else if(end - start < 0){
         direction = -1;
      } else {
         direction = 1;
      }
      System.out.print(start);
      temp = start;
      while(direction != 0 && temp!= end){
         temp = temp + direction;
         System.out.print(", " + temp);
      }
   }
}
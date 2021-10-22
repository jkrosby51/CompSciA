import java.util.*;
public class NumberSquare{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int min = 0;
      int max = 0;
      int temp = 0;
      int size = 0;
      
      System.out.print("Min? ");
      min = input.nextInt();
      System.out.print("Max? ");
      max = input.nextInt();
      size = max - min;      
      
      for(int i = 0; i <= size; i++){
         temp = min + i;
         for(int j = 0; j <= size; j++){
            System.out.print(temp);
            temp++;
            if(temp > max){temp = min;}
         } 
         System.out.println("");
      }
   }
}
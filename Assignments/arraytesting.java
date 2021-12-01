import java.util.*;
public class arraytesting{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int temp = 0;
      
      System.out.print("Enter length: ");
      temp = input.nextInt();
      
      int[] list = new int[temp];
      for(int i = 0; i < list.length; i++){
         temp = 0;
         System.out.print("Insert #" + (i + 1) + ": ");
         temp = input.nextInt();
         list[i] = temp;
      }
      for(int i = 0; i < list.length - 1; i++){
         if (list[i] > list[i + 1])
            list[i + 1]++;
      }
      System.out.print("{");
      for(int i = 0; i < list.length; i++)
         System.out.print(list[i] + ", ");
      System.out.print("}");
   }
}
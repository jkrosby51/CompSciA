import java.util.*;
public class ListTesting{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int temp = 0;
      int stopper = 0;
      ArrayList<Integer> numSet = new ArrayList<Integer>();
      
      while(stopper != -1){
         System.out.print("Enter a number: ");
         temp = input.nextInt();
         
         if(temp == -1)
            stopper = -1;
         if(stopper != -1)   
            numSet.add(temp);
      }
      
      System.out.println("Size: " + numSet.size() + "\n");
      for(int i = 0; i < numSet.size(); i++){
         System.out.println(numSet.get(i));
      }
   }
}
import java.util.*;
public class GeneratedNums{
   public static void main(String[] args){
      int length = 100;
      int[] genNum = new int[length];
      int temp = 0;
      int dig1 = 0;
      int dig2 = 0;
      int dig3 = 0;
      
      System.out.println("Index   Generated Number");
      
      for(int i = 0; i < length; i++){
         if(i >= 10 && i < 100){
            dig1 = i / 10;
            dig2 = i % 10;
            temp = i + dig1 + dig2;
         } else if (i > 100){
            dig1 = i / 100;
            dig2 = (i % 10) / 10;
            dig3 = i % 100;
            temp = i + dig1 + dig2 + dig3;
         } else {
            temp = i * 2;
         }
         
         genNum[i] = temp;
         System.out.println(i + "       " + genNum[i]);
      }
   }
}
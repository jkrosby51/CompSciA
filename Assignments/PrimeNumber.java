import java.util.*;
public class PrimeNumber{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num1 = 0;
      int num2 = 0;
      int arrayLength = 0;
      int primeNumCounter = 0;
      
      System.out.print("Enter a positive number: ");
      num1 = input.nextInt();
      System.out.print("Enter another positive number: ");
      num2 = input.nextInt();
      
      System.out.print("The Prime Numbers are: ");
      arrayLength = num2 - num1;
      int[] primeNumsTemp = new int[arrayLength];
      
      for(int i = num1; i<= num2; i++){
         if(isPrime(i)){
            primeNumsTemp[primeNumCounter] = i;
            primeNumCounter++;
         }
      }
      int[] primeNums = new int[primeNumCounter];
      for(int i = 0; i < primeNumCounter; i++){
         primeNums[i] = primeNumsTemp[i];
         System.out.print(primeNums[i] + " ");
      }
      
   }
   
   static boolean isPrime(int n){
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
  
        if (n % 2 == 0 || n % 3 == 0)
            return false;
  
        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
  
        return true;
        }
}
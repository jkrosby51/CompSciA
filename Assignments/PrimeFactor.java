import java.util.*;
public class PrimeFactor{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int num1 = 0;
      int arrayLength = 0;
      int primeNumCounter = 0;
      int arrayPlace1 = 0;
      int arrayPlace2 = 0;
      int temp = 0;
      
      System.out.print("Enter a positive number: ");
      num1 = input.nextInt();
      
      //Find Factors
      arrayLength = num1;
      int[] factors = new int[arrayLength];
      //System.out.print("Factors: 1, ");
      for(int i = 2; i <= num1; i++){
         if((num1 % i) == 0){
            factors[arrayPlace1] = i;
            //System.out.print(factors[arrayPlace1] + ", ");
            arrayPlace1++;
         }
      }
      
      //Find Prime Factors
      System.out.print("\nThe Prime Factors are: ");
      for(int i = 0; i < arrayLength; i++){
         temp = factors[i];
         if(isPrime(temp)){
            System.out.print(temp + ", ");
         }
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
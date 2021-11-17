import java.util.*;
public class RandomStats{
   public static void main(String[] args){
      Random random = new Random();
      int length = 500;
      int rndmNum[] = new int[length];
      int zero=0,one=0,two=0,three=0,four=0,five=0,six=0,seven=0,eight=0,nine=0;
      
      for(int i = 0; i < length; i++)
         rndmNum[i] = random.nextInt(10);
      for(int i = 0; i < length; i++){
         if(rndmNum[i] == 0)
            zero++;
         else if(rndmNum[i] == 1)
            one++;
         else if(rndmNum[i] == 2)
            two++;
         else if(rndmNum[i] == 3)
            three++;
         else if(rndmNum[i] == 4)
            four++;
         else if(rndmNum[i] == 5)
            five++;
         else if(rndmNum[i] == 6)
            six++;
         else if(rndmNum[i] == 7)
            seven++;
         else if(rndmNum[i] == 8)
            eight++;
         else if(rndmNum[i] == 9)
            nine++;
      }
      
      System.out.println("Number   Occurances");
      System.out.println("0        " + zero);
      System.out.println("1        " + one);
      System.out.println("2        " + two);
      System.out.println("3        " + three);
      System.out.println("4        " + four);
      System.out.println("5        " + five);
      System.out.println("6        " + six);
      System.out.println("7        " + seven);
      System.out.println("8        " + eight);
      System.out.println("9        " + nine);

   }
}
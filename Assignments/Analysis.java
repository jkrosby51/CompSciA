import java.util.*;
public class Analysis{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> numSet = new ArrayList<Integer>();
      int temp = 0;
      int numCount = 0;
      int max = 0;
      int min = 50;
      double median = 0;
      int oF = 0, sT = 0, oeOf = 0, osT = 0, toTwf = 0, tsT = 0, toTf = 0, tsF = 0, foFf = 0, fsF = 0; //xxYy | x == 1st letter of each digit in min | y == 1st letter of each digit in max 
      double total = 0;
      double avgNum = 0;
      
      for(int i = 0; temp != -1; i++){
         System.out.print("Insert a number between 1 and 50, or type -1 to quit: ");
         temp = input.nextInt();
         
         if(temp >= 1 && temp <= 50){
            numSet.add(temp);
            total += temp;
         }else if(temp != -1)
            System.out.println("Only values between 1 and 50 are counted.");
            
         numCount = numSet.size() - 1;
            
         if(numSet.get(numCount) > max)
            max = numSet.get(numCount);
         if(numSet.get(numCount) < min)
            min = numSet.get(numCount);
            
         
            
         if(temp >= 1 && temp <= 5)
            oF++;
         if(temp >= 6 && temp <= 10)
            sT++;
         if(temp >= 11 && temp <= 15)
            oeOf++;
         if(temp >= 16 && temp <= 20)
            osT++;
         if(temp >= 21 && temp <= 25)
            toTwf++;
         if(temp >= 26 && temp <= 30)
            tsT++;
         if(temp >= 31 && temp <= 35)
            toTf++;
         if(temp >= 36 && temp <= 40)
            tsF++;
         if(temp >= 41 && temp <= 45)
            foFf++;
         if(temp >= 46 && temp <= 50)
            fsF++;
      }
 
      numSet.remove(numCount);
      
      avgNum = total / (numSet.size() + 1);
      
      Collections.sort(numSet);
   
      if (numCount % 2 != 0)
         median = (double)numSet.get(numCount / 2);
      else
         median = (double)(numSet.get((numCount - 1) / 2) + numSet.get(numCount / 2)) / 2.0;
         
      int mode = numSet.get(0);
      int temp2 = 1;
      for(int i = 1; i < numCount; i++){
         if(numSet.get(i-1) == numSet.get(i))
            temp++;
         else 
            temp = 1;
            
         if(temp >= temp2){
            mode = numSet.get(i);
            temp2 = temp;
         }
      }
      
      System.out.println();
      System.out.println("Size  :   " + (numSet.size() + 1));
      System.out.println("Total :   " + (int)total);
      System.out.println("Avg   :   " + String.format("%.2f", avgNum));
      System.out.println("Range :   " + max + "-" + min);
      System.out.println("Median:   " + median);
      System.out.println("Mode  :   " + mode);
      
      System.out.println("\nHistogram: \n");
      String asterisk = new String("");
      if(oF > 0)
         asterisk = String.format("%" + oF + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("  1-5 :   " + asterisk);
      if(sT > 0)
         asterisk = String.format("%" + sT + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println(" 6-10 :   " + asterisk);
      if(oeOf > 0)
         asterisk = String.format("%" + oeOf + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("11-15 :   " + asterisk);
      if(osT > 0)
         asterisk = String.format("%" + osT + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("16-20 :   " + asterisk);
      if(toTwf > 0)
         asterisk = String.format("%" + toTwf + "s", "");
      else
         asterisk = "";;
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("21-25 :   " + asterisk);
      if(tsT > 0)
         asterisk = String.format("%" + tsT + "s", ""); 
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("26-30 :   " + asterisk);
      if(toTf > 0)
         asterisk = String.format("%" + toTf + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("31-35 :   " + asterisk);
      if(tsF > 0)
         asterisk = String.format("%" + tsF + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("36-40 :   " + asterisk);
      if(foFf > 0)
         asterisk = String.format("%" + foFf + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("41-45 :   " + asterisk);
      if(fsF > 0)
         asterisk = String.format("%" + fsF + "s", "");
      else
         asterisk = "";
      asterisk = asterisk.replaceAll(" ", "*");
      System.out.println("46-50 :   " + asterisk);
   }
}
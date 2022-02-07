public class Date{

   private int m, d; //month, day
   private int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   public static void main(String[] args){
      Date dec31 = new Date(12, 31);
      System.out.println(dec31.toString());
      System.out.println(dec31.absoluteDay());
   }
   
   public Date(int month, int day){
      m = month;
      d = day;
   }
   
   public int daysInMonth(){
     return ((daysPerMonth[m-1] - d) + 1);
   }
   
   public int getDay(){
      return d;
   }
   
   public int getMonth(){
      return m;
   }
   
   public void nextDay(){
      d++;
      if(d > daysPerMonth[m-1]){
         d = 1;
         m++;
      }
      if(m > 12)
         m = 1;
   }
   
   public String toString(){
      return (String.format("%02d", m) + "/" + String.format("%02d", d)); 
   }
   
   public int absoluteDay(){
      int totalDays = 0;
      for(int i = 0; i < m - 1; i++)
         totalDays += daysPerMonth[i];
      totalDays += d;
      return totalDays;
   }
}
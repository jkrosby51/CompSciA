public class Date(){
   private int m, d; //month, day
   
   public Date(int month, int day){
      m = month;
      d = day;
   }
   
   public int daysInMonth(){
     int[] daysInMonth = new int[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
     int dayCount = daysInMonth[m];
     return (dayCount - d);
   }
   
   public int getDay(){
      return d;
   }
   
   public int getMonth(){
      return m;
   }
   
   public int nextDay(){
      int[] daysInMonth = new int[31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
      
   }
   
   public String toString(){
      
   }
}
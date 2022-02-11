public class TimeSpan{
   private int hr, min;
   
   public TimeSpan(int hours, int minutes){
      hr = hours;
      min = minutes;
   }
   
   public int getHours(){
      return hr;
   }
   
   public int getMinutes(){
      return min;
   }
   
   public void add(int hours, int minutes){
      hr += hours;
      min += minutes;
      if(min > 59){
         hr++;
         min -= 60;
      }
   }
   
   public void add(TimeSpan timespan){
      hr += timespan.hr;
      min += timespan.min;
      if(min > 59){
         hr++;
         min -= 60;
      }
   }
   
   public double getTotalHours(){
      return (hr + ((double)min / 60));
   }
   
   public String toString(){
      return ("" + hr + "h" + min + "m");
   }
}  
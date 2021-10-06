public class Testing{
   public static void main(String[] args){
   int tempCount = 0;
      int temp1 = 0;
      int temp2 = 0;
      int tempCurrent = 23;
      int tempReturn = 0;
      int[] isTrue = new int[200];
      int[] turnCount = new int[200];
      double avgIsTrue = 0;
      
      while(tempCount < 500 && tempReturn == 0){
            if(temp1 == 4 && temp2 == 2){
               isTrue[0] = 1; //1 = true; 0 = false
               turnCount[0] = (tempCount - 2);
               tempReturn = 1;
            }else{
               temp1 = tempCurrent;
               if((tempCurrent % 2) == 0){
                  tempCurrent /= 2;
               } else {
                  tempCurrent = (tempCurrent * 3) + 1;
               }
               System.out.println("TempCurrent: " + tempCurrent);
               temp2 = tempCurrent;
               tempCount++;
            }
            if(temp1 !=4 || temp2 !=2){
               isTrue[0] = 0;
            }
         }
         System.out.println("\nisTrue[0]: " + isTrue[0]);
         System.out.println("turnCount[0]: " + turnCount[0]);
      for(int j = 0; j < 200; j++){
         avgIsTrue += isTrue[j];
      }
      avgIsTrue /= 200;
      System.out.println("\navgIsTrue: " + avgIsTrue);
   
   }
}
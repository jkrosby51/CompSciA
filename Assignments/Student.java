public class Student{
   private int id, units, unitsNeeded;
   private String name;
   
   public Student(String nameI, int idI){
      name = nameI;
      id = idI;
      units = 0;
      unitsNeeded = 180;
   }
   
   public String getName(){
      return name;
   }
   
   public int getID(){
      return id;
   }
   
   public int getUnits(){
      return units;
   }
   
   public void incrementUnits(int i){
      units += i;
   }
   
   public boolean hasEnoughUnits(){
      if(units >= unitsNeeded)
         return true;
      return false;
   }
   
   public String toString(){
      return (name + " (#" + id + ")");
   }
   
}
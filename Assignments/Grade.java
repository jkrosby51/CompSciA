import java.util.*;
public class Grade{

   public static void main(String[] args){
   char letterGrade = 26;
   int correctPoints;
   int totalPoints;
   double percentage;
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter total point possible: ");
   totalPoints = input.nextInt();
   System.out.print("Enter your points: ");
   correctPoints = input.nextInt();
   percentage = ((double)correctPoints / totalPoints) * 100;
   System.out.println("Your score is: " + (int)percentage + "%");
   
   if(percentage > 90){
      letterGrade = Character.toUpperCase(1);
   } else if(percentage <= 90 && percentage > 80){
      letterGrade = Character.toUpperCase(2);
   } else if(percentage <= 80 && percentage > 70){
      letterGrade = Character.toUpperCase(3);
   } else if(percentage <= 70 && percentage > 60){
      letterGrade = Character.toUpperCase(4);
   } else {
      letterGrade = Character.toUpperCase(6);
   }
   
   System.out.printLN("The corresponding letter grade is: " + letterGrade);
   }
}
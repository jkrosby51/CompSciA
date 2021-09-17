import java.util.*;
public class Grade{

   public static void main(String[] args){
   String letterGrade = "z";
   int correctPoints;
   int totalPoints;
   int userChoice;
   double percentage;
   Scanner input = new Scanner(System.in);
   
   System.out.print("Would you like to enter points or percentage (1 for points 2 for percentage): ");
   userChoice = input.nextInt();
   if (userChoice == 1){
   System.out.print("Enter total point possible: ");
   totalPoints = input.nextInt();
   System.out.print("Enter your points: ");
   correctPoints = input.nextInt();
   percentage = ((double)correctPoints / totalPoints) * 100;
   System.out.println("Your score is: " + (int)percentage + "%");
   }
   else{
   System.out.print("Enter percentage: ");
   percentage = input.nextDouble();
   
   }
   if(percentage > 90 && percentage <= 100){
      letterGrade = "A";
   } else if(percentage <= 90 && percentage > 80){
      letterGrade = "B";
   } else if(percentage <= 80 && percentage > 70){
      letterGrade = "C";
   } else if(percentage <= 70 && percentage > 60){
      letterGrade = "D";
   } else if(percentage < 0 || percentage > 100){
      letterGrade = "Error";
   } else {
      letterGrade = "F";
   }
   
   System.out.println("The corresponding letter grade is: " + letterGrade);
   }
}
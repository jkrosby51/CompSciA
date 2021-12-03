import java.util.*;
public class mastermindGame{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random random = new Random(); //random.nextInt(max - min) + 1;
      int pegCount = 0;
      int colorCount = 0;
      int temp = 0;
      int endGame = 0;
      boolean dupe = false;
      int[] guesses = new int[10];
      int correctPegs = 0;
      int correctColors = 0;
      boolean tempBool = false;
      
      System.out.print("Enter the number of pegs (1-10): ");
      pegCount = input.nextInt();
      System.out.print("Enter the number of colors (1-9): ");
      colorCount = input.nextInt();
      
      int[] colors = new int[colorCount];
      int[] pegs = new int[pegCount];
      
      for(int i = 0; i < colorCount; i++)
         colors[i] = random.nextInt(9 - 1) + 1;
      Arrays.sort(colors);
      /*
      System.out.print("colors[]: {");              //Shows Color Answers
      for(int i = 0; i < colorCount; i++)
         System.out.print(colors[i] + ", ");
      System.out.println("}");                        
      
      
      for(int i = 0; i < pegCount; i++)
         pegs[i] = colors[random.nextInt(colorCount)];
      System.out.print("pegs[]  : {");              //Shows Peg Answers
      for(int i = 0; i < pegCount; i++)
         System.out.print(pegs[i] + ", ");
      System.out.println("}");
      */
      
      for(int i = 0; endGame == 0; i++){
         for(int e = 0; e < pegCount; e++)
            guesses[e] = 0;
         correctColors = 0;
         correctPegs = 0;
         System.out.println("\nGuess " + (i + 1) + ":\n");
         for(int e = 0; e < pegCount; e++){
            dupe = false;
            System.out.print("Color for peg " + e + ": ");
            guesses[e] = input.nextInt();
            
            if(guesses[e] == pegs[e])
               correctPegs++;
            for(int a = 0; a < pegCount; a++){
               if(guesses[e] == guesses[a] && e != a)
                  dupe = true;
               
            if(guesses[e] == pegs[a] && dupe == false){
               correctColors++;
               dupe = true;
            }
         }
         }
         
         System.out.println("You have " + correctPegs + " peg(s) correct and " + correctColors + " color(s) correct.");
         if(correctPegs == pegCount){
            System.out.println("\nYou have broken the code in " + (i + 1) + " guesses.");
         }
      }
      
   ////////////////////////
   }
}
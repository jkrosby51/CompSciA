import java.util.*;

public class RemoveString {
   public static void main(String[] args)  {
      Scanner input = new Scanner(System.in);
      String string1;
      String string2;
      String finalString;
      
      System.out.print("Enter a sentence: ");
      string1 = input.nextLine();
      System.out.print("Enter a substring: ");
      string2 = input.nextLine();
      
      finalString = string1.replaceAll(string2, "");
      System.out.println(finalString);
   }
}
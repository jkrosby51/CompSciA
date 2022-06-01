/*
 * File: Wordle.java
 * -----------------
 * This module is the starter file for the Wordle assignment.
 * BE SURE TO UPDATE THIS COMMENT WHEN YOU COMPLETE THE CODE.
 */

import java.util.*;
import edu.willamette.cs1.wordle.WordleDictionary;
import edu.willamette.cs1.wordle.WordleGWindow;

public class Wordle {

   private String answer;

   public void run() {
      double rand = Math.random()*(WordleDictionary.FIVE_LETTER_WORDS.length);
      answer = WordleDictionary.FIVE_LETTER_WORDS[(int)rand];
      System.out.println("ANSWER -- " + answer);
      gw = new WordleGWindow();
      gw.addEnterListener((s) -> enterAction(s));
   }

/*
 * Called when the user hits the RETURN key or clicks the ENTER button,
 * passing in the string of characters on the current row.
 */

    public void enterAction(String s) {
       if(s.length() == 5){
         s = s.toLowerCase();
         if(Arrays.asList(WordleDictionary.FIVE_LETTER_WORDS).contains(s))
            gw.showMessage("real word omg");
         else
            gw.showMessage("Not in word list");
            
         int row = gw.getCurrentRow();
         for(int i = 4; i >= 0; i--){
            String letter = gw.getSquareLetter(row, (WordleGWindow.N_COLS - 1) - i).toLowerCase();
            System.out.println(letter + answer.indexOf(letter));
            if(answer.indexOf(letter) == -1)
               gw.setSquareColor(row, (WordleGWindow.N_COLS - 1) - i, WordleGWindow.MISSING_COLOR);
            else if(answer.indexOf(letter) != -1)
               gw.setSquareColor(row, (WordleGWindow.N_COLS - 1) - i, WordleGWindow.PRESENT_COLOR);
            if(answer. == (WordleGWindow.N_COLS - 1) - i)
              gw.setSquareColor(row, (WordleGWindow.N_COLS - 1) - i, WordleGWindow.CORRECT_COLOR);
         }
       }
    }

/* Startup code */

    public static void main(String[] args) {
        new Wordle().run();
        
    }

/* Private instance variables */

    private WordleGWindow gw;

}

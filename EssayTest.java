//Jake Steckel

import java.util.Scanner;

public class EssayTest
{
   public static void main(String[] args)
   { 
      double grammar;
      double length;
      double spelling;
      double content;
      
      Scanner kb = new Scanner(System.in);
   
      System.out.println("Enter grammer grade(0-30):");
      String value = kb.next();
      grammar = Double.parseDouble(value);
      
      System.out.println("Enter spelling grade(0-20):");
      value = kb.next();
      spelling = Double.parseDouble(value);  
   
      System.out.println("Enter length grade(0-20):");
      value = kb.next();
      length = Double.parseDouble(value);
      
      System.out.println("Enter content grade(0-30);");
      value = kb.next();
      content = Double.parseDouble(value);
      
      Essay essay = new Essay(grammar, spelling, length, content);
      
      System.out.println("\nEssay Grading: \n" 
                         + "Grammar: " + essay.getGrammarScore() + "/30\n"
                         + "Spelling: " + essay.getSpellingScore() + "/20\n"
                         + "Correct Length: " + essay.getLengthScore() + "/20\n"
                         + "Content: " + essay.getContentScore() + "/30");
                         
      System.out.println("\nFinal Score: " + essay.getScore() + "/100\n"
                         + "Grade: " + essay.getGrade());                   
   }
}                       

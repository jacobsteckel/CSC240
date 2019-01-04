//jake steckel

import java.util.Scanner;

public class TestScoresTest 
{
   public static void main (String[]args)
   {
      int numberOfTests;
      
      Scanner kb = new Scanner(System.in);
      
      System.out.println("How many tests will be graded?:");
      numberOfTests = kb.nextInt();
      
      double [] scores = new double[numberOfTests];
      
      System.out.println("Enter the grades of the tests?:");
      
      for(int p=0;p<numberOfTests;p++)
      {
         String grades = kb.next();
         scores[p] = Double.parseDouble(grades);
      }
      
      TestScores tScores = new TestScores(scores,numberOfTests);
      
      System.out.println();
      
      try
      {  
         System.out.println("Average: "+tScores.CalcAverage(scores,numberOfTests));
      }
      catch(IllegalArgumentException e)
      {
         System.out.println(e.getMessage());
      }
   }
}         
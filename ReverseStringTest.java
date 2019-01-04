//Jake Steckel

import java.util.*;

public class ReverseStringTest
{
   public static void main (String[]args)
   {
      String word;
      
      Scanner input = new Scanner(System.in);
 
      System.out.println("Enter a word: ");
      word = input.nextLine();
      
      System.out.println("Reverse of word: "); 
      ReverseString reverse= new ReverseString(word);
   }
}
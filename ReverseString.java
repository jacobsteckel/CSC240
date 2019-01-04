//Jake Steckel

public class ReverseString
{
   private String word;
   
   public ReverseString(String w)
   {
      word=w;
      String reverse="";
      
      for (int i = word.length()-1; i>=0; i--)
         reverse = reverse + word.charAt(i);
      System.out.println(reverse);
   }
}
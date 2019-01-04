//Jacob Steckel

public class MagicSquareTest
{
   public static void main(String[] args)
   {
   
      int square[][] = {{4,9,2},{3,5,7},{8,1,6}};
   
      LoShuMagicSquare mSquare = new LoShuMagicSquare(square);
   
      for (int r = 0; r <square.length; r++) 
      {
         for (int c = 0; c < square[0].length; c++)
         System.out.print(square[r][c]);
         System.out.println();
      }
      
      if(mSquare.oneToNine(square) == true && mSquare.ifEqual(square) == true)
      {
         System.out.println("\n Lo Shu Magic Square");
      }
      else
      {
         System.out.println("\n Not a Lo Shu Square");
      }
   }
}
//Jacob Steckel 

public class LoShuMagicSquare
{
   int[][] square = new int[3][3];

   public LoShuMagicSquare(int[][] sq)
   {
      square = sq;
   }
      
   public boolean ifEqual(int[][] arr)
   {
      int col1 = arr[0][0]+ arr[1][0] + arr[2][0];
      int col2 = arr[1][0]+ arr[1][1] + arr[1][2];
      int col3 = arr[2][0]+ arr[2][1] + arr[2][2];
      int row1 = arr[0][0]+ arr[0][1] + arr[0][2];
      int row2 = arr[0][1]+ arr[1][1] + arr[2][1];
      int row3 = arr[0][2]+ arr[1][2] + arr[2][2];
      int diag1 = arr[0][0]+ arr[1][1] + arr[2][2];
      int diag2 = arr[0][2]+ arr[1][1] + arr[2][0];
      
      if(row1 != row2)
         return false; 
      if(row2 != row3)
         return false;
      if(row3 != col1)
         return false;
      if(col1 != col2)
         return false;
      if(col2 != col3)
         return false;
      if(col3 != diag1)
         return false;
      if(diag1 != diag2)
         return false;
      else 
         return true;
   }   
   
   public boolean oneToNine(int[][]sq)
   {
      for(int r=0; r< sq.length; r++)
      {
         for(int c=0; c<sq.length; c++)
         {
            if(sq[r][c]>9 || sq[r][c]<1)
               return false;
         }
      }  
      for(int r = 0; r < sq.length; r++)
      {
         for(int c = 0; c< sq.length; c++)
         {
            int sc = sq[r][c];
            
            for(int ch = c+1; ch < sq.length; ch++)
            {
               if (sc == sq[r][ch])
                  return false;
            }
         }
      }
      return true;
   }
}
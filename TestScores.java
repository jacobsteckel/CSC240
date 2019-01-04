//Jake Steckel

public class TestScores
{
   private double [] scores;
   private int numberOfTests;
   
   public TestScores(double [] arr, int nt)
   {
      scores=arr;
      numberOfTests=nt;
   }
   
   public double CalcAverage(double[]arr, int nt) throws IllegalArgumentException
   {
      double avg=0;
      double total=0;
      
      for (int i=0;i<nt;i++)
      {
         if(arr[i]>100||arr[i]<0)
         {
            throw new IllegalArgumentException("Invalid grade for test number: " +(i+1));
         }
         else
         {
            total+=arr[i];
         }
      }
      avg=total/nt;
      return avg;
   }  
}   

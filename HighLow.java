//Jake Steckel

public class HighLow <HL extends Comparable<HL>>
{
   private HL [] a;
   
   //constructor
   public HighLow(HL[]nums) 
   {
      a = nums;
   }
   
   //get highest value in array
   public HL getHigh() 
   {
      HL high = a[0];
      for (int i = 1; i < a.length; i++) 
      {
         if (a[i].compareTo(high) > 0) 
         {
            high = a[i];
         }
      }
      return high;
   }
   
   //get lowest value in array
   public HL getLow() 
   {
      HL low = a[0];
      for (int i = 1; i < a.length; i++)
      {
         if (a[i].compareTo(low) < 0) 
         {
            low = a[i];
         }
      }
      return low;
   }
   
   //main
   public static void main(String[] args) 
   {
      Integer[] numbers = {1,2,3,4,5,6,7,8};
      HighLow <Integer> values = new HighLow<>(numbers);
      System.out.println("Highest value: "+values.getHigh());
      System.out.print("Lowest value: "+values.getLow());
   }
}
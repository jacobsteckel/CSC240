//Jake Steckel

import java.util.ArrayList;

public class MyList <T extends Number> 
{
   ArrayList<T> list = new ArrayList<T>();
   
   //add value to arraylist
   public void add(T t)
   {
      list.add(t);
   }
   //get largest value in arraylist
   public T largest() 
   {
      T largest = list.get(0);
      for (T temp : list)
      {
         if(temp.doubleValue() > largest.doubleValue())
         {
            largest = temp;
         }
      }
      return largest;      
   }
   //get smallest value in arraylist
   public T smallest()
   {
      T smallest = list.get(0);
      for (T temp : list)
      {
         if(temp.doubleValue() < smallest.doubleValue())
         {
            smallest = temp;
         }
      }
      return smallest;
   }
   //main
   public static void main(String[] args)
   {
      MyList<Integer> list = new MyList<Integer>();
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      System.out.println("Smallest value in the list: "+list.smallest());
      System.out.println("Largest value in the list: "+list.largest());
   }
}
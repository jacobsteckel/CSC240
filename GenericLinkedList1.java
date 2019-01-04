//Jake Steckel

import java.util.Scanner;
public class GenericLinkedList1<E> 
{
   private class Node 
   {
      Object value;
      Node next;
      Node(Object val, Node n) 
      {
         value = val;
         next = n;
      }
      Node(Object val) 
      {
         this(val, null);
      }
   }
   
   private Node first;
   private Node last;
   
   public void clear() 
   {
      int index = 0;
      if(first != null) 
      {
         Node temp = first;
         while( temp != null) 
         {
            temp = temp.next;
            remove(index);
         }
      }
   }
   public Object get(int index) 
   {
      int i = 0;
      if(first != null) 
      {
         Node temp = first;
         while( temp != null) 
         {
            if(i == index)
            return temp.value;
            i++;
            temp = temp.next;
         }
      }
      return null;
   }
   public Object set(int index, Object element) 
   {
      int i = 0;
      if(first != null) 
      {
         Node temp = first;
         while( temp != null) 
         {
            if(i == index) 
            {
               Object prev = temp.value;
               temp.value = element;
               return prev;
            }
            i++;
            temp = temp.next;
         }
      }
      return null;
   }
   public boolean isEmpty() 
   {
      return first == null;
   }
   public int size() 
   {
      int count = 0;
      Node p = first;
      while (p != null) 
      {
         count++;
         p = p.next;
      }
      return count;
   }
   public void add(Object e) 
   {
      if (isEmpty()) 
      {
         first = new Node(e);
         last = first;
      } 
      else 
      {
         last.next = new Node(e);
         last = last.next;
      }
   }
   public void add(int index, Object e) 
   {
      if (index < 0 || index > size()) 
      {
         String message = String.valueOf(index);
         throw new IndexOutOfBoundsException(message);
      }
      if (index == 0) 
      {
         first = new Node(e, first);
         if (last == null)
            last = first;
         return;
      }
      Node pred = first;
      for (int k = 1; k <= index - 1; k++) 
      {
         pred = pred.next;
      }
      pred.next = new Node(e, pred.next);
      if (pred.next.next == null)
         last = pred.next;
   }
   public String toString()
   {
      StringBuilder strBuilder = new StringBuilder();
      Node p = first;
      while (p != null) 
      {
         strBuilder.append(p.value + "\n");
         p = p.next;
      }
      return strBuilder.toString();
   }
   public Object remove(int index) 
   {
      if (index < 0 || index >= size()) 
      {
         String message = String.valueOf(index);
         throw new IndexOutOfBoundsException(message);
      }
      Object element;
      if (index == 0) 
      {
         element = first.value;
         first = first.next;
         if (first == null)
            last = null;
      } 
      else 
      {
         Node pred = first;
         for (int k = 1; k <= index - 1; k++)
         pred = pred.next;
         element = pred.next.value;
         pred.next = pred.next.next;
         if (pred.next == null)
            last = pred;
      }
      return element;
   }
   public boolean remove(Object element) 
   {
      if (isEmpty())
         return false;
      if (element.equals(first.value)) 
      {
         first = first.next;
         if (first == null)
            last = null;
         return true;
      }
      Node pred = first;
      while (pred.next != null &&!pred.next.value.equals(element)) 
      {
         pred = pred.next;
      }
      if (pred.next == null)
         return false;
      pred.next = pred.next.next;
      if (pred.next == null)
         last = pred;
      return true;
   }
   
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      GenericLinkedList1<Double> ll = new GenericLinkedList1<Double>();
      ll.add(25.3);
      ll.add(5.34);
      ll.add(78.3);
      ll.add(78.0);
      ll.add(2, 23.6);
      System.out.println("The members of the list are:");
      System.out.print(ll);
      int index = -1; 
      double number; 
      do 
      {
         System.out.println("Set: Enter a position in the list.");
         String indexString = sc.nextLine();
         index = Integer.parseInt(indexString);
         if (index < 0 || index >= ll.size())
            System.err.println("The number you entered is not a legal position.");
      } while (index < 0 || index >= ll.size());
      System.out.println("Enter a real number.");
      String numberString = sc.nextLine();
      number = Double.parseDouble(numberString);
      Double oldNumber = (Double) ll.set(index, number);
      System.out.println("Old number was " + oldNumber);
      System.out.println("The members of the list are:");
      System.out.print(ll);
      index = -1;
      do 
      {
         System.out.println("Enter a position in the list.");
         String indexString = sc.nextLine();
         index = Integer.parseInt(indexString);
         if (index < 0 || index >= ll.size())
         System.err.println("The number you entered is not a legal position.");
      } while (index < 0 || index >= ll.size());
      System.out.println("Get: The element at that position is " + ll.get(index));
      ll.clear();
      System.out.println("After clearing the list: size = "+ll.size());
   }
}
//Jake Steckel

public class LinkedList1
{
   private class Node{
      String value;
      Node next;
   
      Node(String val, Node n){
         value = val;
         next = n;
      }
      
      Node(String val){
         this(val, null);
      }
   }
   
   private Node first;
   private Node last;
   
   public LinkedList1(){
      first = null;
      last = null;
   }
   
   public boolean isEmpty(){
      return first == null;
   }
   
   public int size(){
      int count = 0;
      Node p = first;
      while (p != null){
         count ++;
         p = p.next;
      }
      return count;
   }
   
   public void add(String e){
      if (isEmpty()){
         first = new Node(e);
         last = first;
      }else{
         last.next = new Node(e);
         last = last.next;
      }
   }
   
   public void add(int index, String e){
      if(index<0 || index>size()){
         String message = String.valueOf(index);
         throw new IndexOutOfBoundsException(message);
      }
      
      if(index==0){
         first = new Node(e, first);
         if(last ==null)
            last = first;
         return;
      }
      
      Node pred = first;
      for(int k=1; k <= index -1; k++){
         pred = pred.next;
      }
      
      pred.next = new Node(e, pred.next);
      
      if(pred.next.next == null)
         last = pred.next;
   }
   
   public String toString(){
      StringBuilder strBuilder = new StringBuilder();
      
      Node p = first;
      while(p != null){
         strBuilder.append(p.value + "\n");
         p = p.next;
      }
      return strBuilder.toString();
   }
   
   public String remove(int index){
      if(index < 0 || index >= size()){
         String message = String.valueOf(index);
         throw new IndexOutOfBoundsException(message);
      }
      
      String element;
      if(index == 0){
         element = first.value;
         first = first.next;
         if(first == null)
            last = null;
         
      }else{
         Node pred = first;
         
         for(int k=1; k <= index-1; k++)
            pred = pred.next;
         
         element = pred.next.value;
         
         pred.next = pred.next.next;
         
         if(pred.next == null)
            last = pred;
      }
      return element;
   }
   
   public boolean remove(String element){
      if(isEmpty())
         return false;
      
      if(element.equals(first.value)){
         first = first.next;
         if(first == null)
            last = null;
         return true;
      }
      
      Node pred = first;
      while(pred.next != null && !pred.next.value.equals(element)){
         pred = pred.next;
      }
      
      if(pred.next == null)
         return false;
      
      pred.next = pred.next.next;
      
      if(pred.next == null)
         last = pred;
         
      return true;
   }
   public void reverse()
   {
      if(size()>1)
      {
         Node t;
         t=first.next;
         last=t.next;
         first.next=null;
         while(last!=null)
         {  
            t.next=first;
            t=last;
            last=last.next;
         }
         t.next=first;
         first=t;
      }
      else
      {
         return ;
      }
   }
         
   public void sort()
   {
      if(size()>1)
      {
         Node mid=null;
         Node mid2=null;
         Node temp=first.next;
         Node start=first;
         
         while(temp!=null)
         {
            if(first.value.compareTo(temp.value)>0)
            {
               mid=first;
               first=temp;
            }
            temp=temp.next;
         }
         Node temp2=start;
         while(temp2!=null)
         {
            if(first.value.compareTo(temp2.value)<0)
            {
               mid2=last;
               last=temp2;
            }              
            temp2=temp2.next;
         }

         if(mid2!=null)
         {
            first.next=mid;
            mid.next=mid2;
            mid2.next=last;
            last.next=null;
         }
         else
         {
            first.next=mid;
            mid.next=last;
            last.next=null;
         }
      }              
   }         
}
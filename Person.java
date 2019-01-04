//jake steckel

public class Person
{
   private String name;
   private String address; 
   private String number; 
   
   //constructors
   public Person()
   {
   
   }
   public Person(String n, String add, String num)
   {
      name = n;
      address = add;
      number = num;
   }
   
   //setter methods
   public void setName(String n)
   {
      name = n;
   }
   public void setAddress(String add)
   {
      address = add;
   }
   public void setNumber(String num)
   {
      number = num;
   }
   
   //getter methods
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public String getNumber()
   {
      return number;
   }
}
      
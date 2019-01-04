//jake steckel

import java.util.Scanner;

public class CustomerTest
{
   public static void main(String[] args)
   {
      String list;
      String customerNumber;
      boolean mailingList;

      Scanner kb = new Scanner(System.in);
    
      System.out.println("Enter customer phone number: ");
      customerNumber = kb.next();
    
      System.out.println("Mailing list?");
      System.out.println("Enter 'true' if yes or Enter 'false' if no");
      mailingList = kb.nextBoolean();
    
      Customer c = new Customer(customerNumber, mailingList);
    
      if(c.getList() == true)
      {
         System.out.println();
         System.out.println("Name: " + c.getName());
         System.out.println("Address: " + c.getAddress());
         System.out.println("Phone #: " + c.getNumber());
         System.out.println("Customer #: " + c.getCustomerNumber());
         
      }
      else
      {
         System.out.println("You are not on the mailing list");
      }
   }
}
    
    
    
//jake steckel

public class Customer extends Person
{
   public String customerNumber;
   private boolean list;
   
   public Customer(String cN, boolean L)
   {
      customerNumber = cN;
      list = L;
        
      String customerName = "Jake Steckel";
      String customerAddress = "226 winter green ct";
      String customerNumber = "570-369-3515"; 
        
      setName(customerName);
      setAddress(customerAddress);
      setNumber(customerNumber);
       
   }   
   
   public String getCustomerNumber()
   {
      return customerNumber;
   }
   public boolean getList()
   {
      return list;
   }
   
}
   
         
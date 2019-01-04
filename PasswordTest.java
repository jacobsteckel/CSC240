//jake steckel

import javax.swing.JOptionPane;

public class PasswordTest
{
   public static void main(String[] args)
   {
      String thePassword = JOptionPane.showInputDialog("Enter your password?");
      System.out.println(thePassword);
   
      char password[] = thePassword.toCharArray();
      
      Password p = new Password(password);
   
      if(p.checkPassword(password) == true)
      {
         System.out.println("valid");
      }
      else
      {
         System.out.println("invalid");
      } 
   }
}
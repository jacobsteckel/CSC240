//Jake Steckel

import javax.swing.JOptionPane;

public class Password
{
   char[] password;
   public Password()
   {
   
   }   
   public Password(char[] p)
   {
   
      password = p;
   } 
   public boolean checkPassword(char[] p)
   {
      int digits = 0;
      int letters = 0;
      int upperCase = 0;
      int lowerCase = 0;
      
      for(int i=0; i<p.length; i++)
      {
         if(Character.isDigit(p[i]))
            digits++;
         if(Character.isLetter(p[i]))
            letters++;
         if(Character.isUpperCase(p[i]))
            upperCase++;
         if(Character.isLowerCase(p[i]))
            lowerCase++;
      }
      if(digits == 0)
         return false;
      if(letters == 0)
         return false;
      if(upperCase == 0)
         return false;
      if(lowerCase == 0)
         return false;
      if(p.length < 6)
         return false;
      else 
         return true;
   } 
} 
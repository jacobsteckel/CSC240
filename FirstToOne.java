import javax.swing.JOptionPane;

public class FirstToOne
{
   public static void main (String[]args)
   {
      final int DIE_SIDES=6;
      Dice die = new Dice(DIE_SIDES);
      
      Player one = new Player(50);
      Player two = new Player(50);
      
      JOptionPane.showMessageDialog(null,"Welcome to First To One");
      
      do
      {
         die.roll();
         JOptionPane.showMessageDialog(null,"Player 1's turn, click 'OK' to roll");
         JOptionPane.showMessageDialog(null,"Player 1 rolled a "+die.getValue());
         one.setPoints(one.getPoints()-die.getValue());
         if(one.getPoints()<1)
            one.setPoints(one.getPoints()+(die.getValue()*2));  
         JOptionPane.showMessageDialog(null, "Player 1 has "+one.getPoints());
         
         
         die.roll();
         JOptionPane.showMessageDialog(null,"Player 2's turn, click 'OK' to roll");
         JOptionPane.showMessageDialog(null,"Player 2 rolled a "+die.getValue());
         two.setPoints(two.getPoints()-die.getValue());
         if(two.getPoints()<1)
            two.setPoints(two.getPoints()+(die.getValue()*2));   
         JOptionPane.showMessageDialog(null, "Player 2 has "+two.getPoints());
         
         
      }
      while(one.getPoints()!=1 && two.getPoints()!=1);
      
      if(one.getPoints()==1)
      JOptionPane.showMessageDialog(null,"Player 1 wins!");
      if(two.getPoints()==1)
      JOptionPane.showMessageDialog(null,"Player 2 wins!");
   }  
}
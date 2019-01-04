import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class LinkedList1Demo extends JFrame{
   private LinkedList1 ll;
   private JTextArea listView;
   private JTextField cmdTextField;
   private JTextField resultTextField;
   
   public LinkedList1Demo(){
      ll = new LinkedList1();
      listView = new JTextArea();
      cmdTextField = new JTextField();
      resultTextField = new JTextField();
      
      JPanel resultPanel = new JPanel(new GridLayout(1,2));
      resultPanel.add(new JLabel("Command Result"));
      resultPanel.add(resultTextField);
      resultTextField.setEditable(false);
      add(resultPanel, BorderLayout.NORTH);
      
      add(listView);
      listView.setEditable(false);
      listView.setBackground(Color.WHITE);
      
      JPanel cmdPanel = new JPanel(new GridLayout(1,2));
      cmdPanel.add(new JLabel("Command:"));
      cmdPanel.add(cmdTextField);
      add(cmdPanel, BorderLayout.SOUTH);
      cmdTextField.addActionListener(new CmdTextListener());
      
      setTitle("Swing Linked List Demo");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      pack();
      setVisible(true);
   }
   
   private class CmdTextListener implements ActionListener{
      public void actionPerformed(ActionEvent evt){
         String cmdText = cmdTextField.getText();
         
         Scanner sc = new Scanner(cmdText);
         String cmd = sc.next();
         switch(cmd){
            case "add":
               if (sc.hasNextInt()){
                  int index = sc.nextInt();
                  String element = sc.next();
                  ll.add(index, element);
               }else{
                  String element = sc.next();
                  ll.add(element);
               }
               listView.setText(ll.toString());
               pack();
               return;
            case "remove":
               if (sc.hasNextInt()){
                  int index = sc.nextInt();
                  String res = ll.remove(index);
                  resultTextField.setText(res);
               }else{
                  String element = sc.next();
                  boolean res = ll.remove(element);
                  String resText = String.valueOf(res);
                  resultTextField.setText(resText);
               }
               listView.setText(ll.toString());
               pack();
               return;
            case "isempty" :
               String resText = String.valueOf(ll.isEmpty());
               resultTextField.setText(resText);
               return;
            case "size":
               String resText1 = String.valueOf(ll.size());
               resultTextField.setText(resText1);
               return;
            case "sort":
               ll.sort();  
               listView.setText(ll.toString());
               pack();
               return;
            case "reverse":
               ll.reverse();
               listView.setText(ll.toString());
               pack();
               return;      
         }
      }
   }
   
   public static void main(String[] args){
      new LinkedList1Demo();
   }
}
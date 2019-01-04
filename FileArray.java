/*
Jacob Steckel

Design a class that has a static method named writeArray. The method should take two arguments: 
the name of a file and a reference to an int array. The file should be opened as a binary file, 
the contents of the array should be written to the file, and then the file should be closed.

Write a second method in the class named readArray. The method should take two arguments: 
the name of a file and a reference to an int array. The file should be opened, 
data should be read from the file and stored in the array, and then the file should be closed. 
Demonstrate both methods in a program. 
*/

import java.io.*;

public class FileArray
{
   public static void writeArray (File file, int[]arr) throws IOException
   {
      DataOutputStream output = new DataOutputStream(new FileOutputStream(file));
      
      for(int i=0; i<arr.length;i++)
      {
         output.writeInt(arr[i]);
      }
      output.close();
   }
   
   public void readArray(File file, int[]arr) throws IOException
   {
      int number;
      boolean end=false;
      
      FileInputStream input = new FileInputStream(file);
      DataInputStream data = new DataInputStream(input);
      
      System.out.print("Numbers in File: ");
      while(!end)
      {
         try
         {
            for(int i=0;i<arr.length;i++)
            {
               arr[i]=data.readInt();
               System.out.print(arr[i]+", ");
            }
         }
         catch(EOFException e)
         {
            end=true;
         }   
      }
      data.close();       
   }
}   
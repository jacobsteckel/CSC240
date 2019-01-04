//Jacob Steckel
import java.io.*;

public class FileArrayTest
{
   public static void main (String[]args) throws IOException
   {
      int[]a={1,2,3,4,5};
      File f = new File("ArrayBinaryFile.dat");
      FileArray file = new FileArray();
      file.writeArray(f,a);
      System.out.println("File Written");
      file.readArray(f,a);
      System.out.println("\nFile Read");
   }
}      
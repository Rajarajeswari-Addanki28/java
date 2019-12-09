import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);

  byte buffer[]=new byte[10];
   int n1=ob.read(buffer);
  for(int i=0;i<buffer.length;i++)
   {      System.out.println((char)buffer[i]);
    }
   
  

}
}
  

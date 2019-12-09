import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);

  byte buffer[]=new byte[10];
   ob.read();
   ob.read();
   ob.read();
   int n1=ob.read(buffer,3,4);
   for(int i=0;i<buffer.length;i++)
       System.out.print((char)buffer[i]);
   
  

}
}
  

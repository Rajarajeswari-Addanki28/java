import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);
   OutputStream ob1=new FileOutputStream(args[1]);
    byte b[]=new byte[10];
   ob.read(b);
 ob1.write(b,2,4);
  ob.close();
  ob1.close();
}
}
  

import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);
   OutputStream ob1=new FileOutputStream(args[1]);

   int n1=ob.read();
  while(n1!=-1)
  {
    
   ob1.write(n1);
  n1=ob.read();
}
}
}
  

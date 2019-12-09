import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);


   int n1=ob.read();
  while(n1!=-1)
  {
    System.out.print((char)n1);
   
  n1=ob.read();
}
}
}
  

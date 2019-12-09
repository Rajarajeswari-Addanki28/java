import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   InputStream ob=new FileInputStream(args[0]);


   int n1=ob.read();
   System.out.println(n1);
   System.out.println((char)n1);


}
}
  

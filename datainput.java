import java.io.*;
class take
{
  public static void main(String args[]) throws IOException
{
   DataInputStream ob=new DataInputStream(System.in);
   int n=ob.read();
  while(n!='#')
  {
 
 System.out.println((char)n);
 n=ob.read();
}
ob.close();
}
}
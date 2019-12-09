import java.io.*;
class take
{
  public static void main(String args[]) throws IOException
{
    OutputStream ob2=new FileOutputStream("new.txt");
   DataInputStream ob=new DataInputStream(System.in);
   int n=ob.read();
  while(n!='#')
  {
 
ob2.write(n);
 n=ob.read();
}
ob.close();
ob2.close();
}
}
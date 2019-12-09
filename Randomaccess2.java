import java.io.*;
class you
{
  public static void main(String args[]) throws IOException
{
   byte b[]=new byte[5];
  RandomAccessFile on=new RandomAccessFile("1.txt","rw");
  on.seek(1);
   on.write('&');
 for(int i=0;i<b.length;i++)
{
   System.out.println((char)b[i]);
}
 on.close();
}
}
  
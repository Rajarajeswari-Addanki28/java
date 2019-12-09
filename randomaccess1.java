import java.io.*;
class your
{
  public static void main(String args[]) throws IOException
{
   byte b[]=new byte[5];
  RandomAccessFile on=new RandomAccessFile("1.txt","r");
  on.seek(1);
   on.read(b);
 for(int i=0;i<b.length;i++)
{
   System.out.println((char)b[i]);
}
 on.close();
}
}
  
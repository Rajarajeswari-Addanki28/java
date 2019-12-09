import java.io.*;
class yours
{
  public static void main(String args[]) throws IOException
{
  RandomAccessFile on=new RandomAccessFile("1.txt","r");
  on.seek(1);


 System.out.println((char)on.read());
 on.close();
}
}
  
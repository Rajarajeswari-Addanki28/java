import java.io.*;
class buffer
{
  public static void main(String args[]) throws IOException
{
  FileReader fr=new FileReader(args[0]);
  BufferedReader br=new BufferedReader(fr);
  int n=br.read();
  while(n!=-1)
  {
    System.out.print((char)n+"");
   n=br.read();

   }
  System.out.println("#");
  fr.close();
}
}
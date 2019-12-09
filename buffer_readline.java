import java.io.*;
class buffer
{
  public static void main(String args[]) throws IOException
{
  FileReader fr=new FileReader(args[0]);
  BufferedReader br=new BufferedReader(fr);
  String s1=br.readLine();
  while(s1!=null)
  {
    System.out.println(s1);
   s1=br.readLine();

   }
  System.out.println("End of the file");
  fr.close();
}
}
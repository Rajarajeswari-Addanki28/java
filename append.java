import java.io.*;
class buffer
{
  public static void main(String args[]) throws IOException
{
  FileWriter fr=new FileWriter("uu.txt",true);
 
  fr.write("all of you");
   
  fr.close();

}
}
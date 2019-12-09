import java.io.*;
class buffer
{
  public static void main(String args[]) throws IOException
{
  FileWriter fr=new FileWriter(args[0]);
  BufferedWriter br=new BufferedWriter(fr);
  br.write("Welcome");
    br.close();
  
  fr.close();

}
}
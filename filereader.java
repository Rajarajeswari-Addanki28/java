import java.io.*;
class rewer
{
 public static void main(String args[])  throws  IOException
{
     int c=1;
    Reader ob= new FileReader(args[0]);
   int n1=ob.read();
   while(n1!=-1)
   {
         if(n1=='\n')
         {
             c++;
         }
    n1=ob.read();
}
    System.out.println("no of lines in file::"+c);
}
}
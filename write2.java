import java.io.*;
class reader
{
  
 public static void main(String args[])  throws IOException
{
  
   
   OutputStream ob1=new FileOutputStream(args[0]);
   byte bu[]=new byte[10];
   bu[0]='w';
   bu[1]='e';
   bu[2]='l';
   
    
   ob1.write(bu);
 

}
}
  

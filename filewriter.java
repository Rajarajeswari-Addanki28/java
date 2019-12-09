import java.io.*;
class rewers
{
 public static void main(String args[])  throws  IOException
{
    
    Reader ob= new FileReader(args[0]);
    Writer ob1=new FileWriter(args[1]);
   int n1=ob.read();
   while(n1!=-1)
   {
         if(n1=='a'||n1=='e'||n1=='i'||n1=='o'||n1=='u'||n1=='A'||n1=='E'||n1=='I'||n1=='O'||n1=='U')
         {
             ob1.write(n1);
         }
    n1=ob.read();
}
    
  ob.close();
  ob1.close();
}
}
import java.lang.*;
import java.io.*;
class rewers
{
 public static void main(String args[])  throws  IOException
{
    
    Reader ob= new FileReader(args[0]);
  Writer ob4=new FileWriter(args[2]);

     int n1=ob.read();
   
   while(n1!=-1)
   {      
      ob4.write(n1);  
    n1=ob.read();
}
    ob.close();
     ob4.close();



  Reader ob2=new FileReader(args[1]);
    Writer ob1=new FileWriter(args[0]);
   int n2=ob2.read();
   
   while(n2!=-1)
   {      
      ob1.write(n2);  
    n2=ob2.read();
}
     ob2.close();
      ob1.close();

   Reader ob5=new FileReader(args[2]);
   Writer ob3=new FileWriter(args[1]);
   
  int n3=ob5.read();
   
   while(n3!=-1)
   {      
      ob3.write(n3);  
    n3=ob5.read();
} 
  
 
   ob3.close();
   ob5.close();
 
}
}

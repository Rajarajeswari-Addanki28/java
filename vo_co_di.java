import java.lang.*;
import java.io.*;
class rewers
{
 public static void main(String args[])  throws  IOException
{
    
    Reader ob= new FileReader(args[0]);
    Writer ob1=new FileWriter(args[1]);
    Writer ob2=new FileWriter(args[2]);
    Writer ob3=new FileWriter(args[3]);
   Writer ob4=new FileWriter(args[4]);
  
   int n1=ob.read();
   
   while(n1!=-1)
   {      
         if((n1>='a'&&n1<='z')||(n1>='A'&&n1<='B'))
         {
            if(n1=='a'||n1=='e'||n1=='i'||n1=='o'||n1=='u'||n1=='A'||n1=='E'||n1=='I'||n1=='O'||n1=='U')
                 ob1.write(n1);
            else
                ob2.write(n1);
             
         }
     else if(n1>='0'&&n1<='9')
             ob3.write(n1);
       else
            ob4.write(n1);
        
           
         
    n1=ob.read();
}
    
  ob.close();
  ob1.close();
  ob2.close();
  ob3.close();
   ob4.close();
}
}

import java.io.*;
class out
{
  public static void main(String args[]) throws IOException
 {
  
  File ob=new File(args[0]);
   boolean k=ob.exists();
   if(k==true)
   {
     
      if(ob.isDirectory())
           {  
               System.out.println("it is a Directory");

             File s[] = ob.listFiles();

          for (int i=0; i < s.length; i++) 
         { 
           System.out.println(s[i]);
         }
     }

        else if(ob.isFile());
         {
            System.out.println("it is a file");
            System.out.println(ob.canWrite() ? " is Writeable " : "is not writeable");
  
            System.out.println(ob.canRead() ? " is readable " : "is not readable");
          }

        
}
else
{
    System.out.println("doesn't exists");
}
}
}

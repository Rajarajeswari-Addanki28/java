import java.io.*;
class rat
{
    public static void main(String args[]) throws IOException
  {
     Reader ob=new FileReader("alter.txt");
      int n=ob.read();
      int c=0;
      while(n!=-1)
      {
           
         if(c%2==0)
        {
         System.out.println((char)n);
    
         
          }
c++;
    n=ob.read();
      
}
ob.close();

}
} 
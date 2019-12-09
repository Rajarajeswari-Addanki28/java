import java.io.*;
class rat
{
    public static void main(String args[]) throws IOException
  {
     Reader ob=new FileReader("alter.txt");
      int n=ob.read();
    
    System.out.println((char)n);
      while(n!=-1)
      {
          char c=(char)n; 
         if(c==','||c=='.'||c=='\n'||c==' ')
        {
         n=ob.read();
        if(n==-1)
            break;
         System.out.println((char)n);
      
    
         
          }

    n=ob.read();
      
}
ob.close();

}
} 
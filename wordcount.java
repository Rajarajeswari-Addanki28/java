import java.io.*;
class rat
{
    public static void main(String args[]) throws IOException
  {
     Reader ob=new FileReader("alter.txt");
      int n=ob.read();
    
    int count=0;
      while(n!=-1)
      {
          char c=(char)n; 
         if(c==','||c=='.'||c=='\n'||c==' ')
        {
         
        
       count++;
      
    
         
          }

    n=ob.read();
      
}
 System.out.println(count);
ob.close();

}
} 
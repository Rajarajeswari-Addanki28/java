import java.io.*;
class deee
{
  public static void main( String args[]) throws IOException
  {
     Reader ob=new FileReader("1.txt");
     Reader ob2=new FileReader("2.txt");
     
     
   int  n=ob.read();
   int  m=ob2.read();
 Writer ob3=new FileWriter("1.txt");
     int c=0;
     while(n!=-1)
     {
       c++;
         if(c%2==0)
          {
              ob3.write(m);
           }
          else
            {
            ob3.write(n);
            }
        n=ob.read();
           m=ob2.read();
}

   ob.close();
   ob2.close();
    ob3.close();


Reader ob4=new FileReader("2.txt");
Reader ob5=new FileReader("1.txt");
int k=ob4.read();
int l=ob5.read();
Writer ob6=new FileWriter("2.txt");
int d=0;
  while(k!=-1)
   {
      d++;
      if(d%2!=0)
       {
           ob6.write(l);
        }
        else
      {
           ob6.write(k);
       }
    k=ob4.read();
    l=ob5.read();
}
ob4.close();
ob5.close();
ob6.close();
     

}
}
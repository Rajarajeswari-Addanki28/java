import java.io.*;
class vow
{
  public static void main(String args[]) throws IOException
{  
    int c=0;
   InputStream ob=new FileInputStream(args[0]);
   int n1=ob.read();
   while(n1!=-1)
   {
     if(n1=='a'||n1=='e'||n1=='i'||n1=='o'||n1=='u'||n1=='A'||n1=='E'||n1=='I'||n1=='O'||n1=='U')
{
   c++;
}
n1=ob.read();
}
System.out.println("no of vowels presents in files:::"+c);
}
}


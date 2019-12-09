 import java.util.*;

class revese
{
  public static void main(String ar[])
{  
   int i,j;
  char c;
  char str[]={'h','e','l','l','o'};

  String b=new String(str);
 
  System.out.println(b);
  int n=b.length();
  System.out.println(n);
  for(i=0;i<=(n-1)/2;i++,n--)
{
 
       c=str[i];
      str[i]=str[n-1];
      str[n-1]=c;
      
}
 
  String d=new String(str);
 
 System.out.println(d); 
}
}

  
   
  
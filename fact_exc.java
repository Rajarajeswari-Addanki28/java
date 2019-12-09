import java.util.*;
import java.lang.*;
class myexcep extends Exception
{
    int a;
    myexcep(int x)
    {
      a=x;
     }
 public String toString()
 {
   return a+"is negative number";
   
 
}
}

class teste
{
  static void factorial(int a) throws myexcep
{    int f=1,i;
   
    
       if(a<0)
            throw new myexcep(a);
        else
         {
            for(i=a;i>1;i--)
          {
           f=f*i;
           }
           System.out.println(a+"factorial is"+f);
          }
}
public static void main(String args[])
{
 Scanner ob=new Scanner(System.in);
 int d=ob.nextInt();
try
{
  factorial(d);
 
   } 
 catch(myexcep e)
{
  System.out.println(e);
}
}
}

       

import java.lang.*;
class myexception extends Exception
{
   int a;
       myexception(int x)
	{
            a=x;
           }
public String toString()
{
   return a+"is greaterthan 10";
}


}
class test
{
    static void display(int a) throws myexception
     { 
            System.out.println("start"+a);
            if(a>10)
               throw new myexception(a);
            System.out.println("no exception");
      }
  public static void main(String args[])
 {
   
try
{  
 display(5);
 display(15);
}
catch(myexception e)
{

  System.out.println("value<10");
  System.out.println(e);
  
  
}
}
}
 
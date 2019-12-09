import java.lang.*;
class noteligible extends Exception
{
   int a;
       noteligible(int x)
	{
            a=x;
           }
public String toString()
{
   return a+" you are not eligible ";
}
}


class negative extends Exception
{
   int b;
       negative(int y)
	{
            b=y;
           }
public String toString()
{
   return b+" is negative ";
}
}


class test
{
    static void display(int a) throws noteligible,negative
     { 
            int c=a;
           
             if(c<0)
              {
              throw new negative(c);
              }  
          if(c<18)
             {
            throw new noteligible(c);
              }
            System.out.println("you are eligible ");
      }
  public static void main(String args[])
 {
   
try
{  
   int n1=Integer.parseInt(args[0]);
    display(n1);
}
catch(negative e)
{

  
  System.out.println(e);
  
  
}
catch(noteligible e)
{

  
  System.out.println(e);
  
  
}
}
}
 
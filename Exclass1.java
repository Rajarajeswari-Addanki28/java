import java.util.*;
import java.lang.*;
class Number
{
   private double a;
   Number(int b)
   {
     a=b;
   System.out.println("meowww");
    }
boolean isZero()
{
   if(a==0)
     return true;
   else 
     return false;
}
boolean ispositive()
{
   if(a>0)
       return true;
    else
        return false;
}
boolean isNegative()
{
   if(a<0)
     return true;
   else 
     return false;
}
boolean isOdd()
{
   if(a%2!=0)
     return true;
   else 
     return false;
}
boolean isEven()
{
   if(a%2==0)
     return true;
   else 
     return false;
}
boolean isPrime()
{ 
if(a<0)
{
 System.out.println("it's negative .so ,");
 return false;
}
else
{
int count=0,i;
 for(i=1;i<=a;i++)
      {
         if(a%i==0)
          {   
           count++;
           }
       }
if(count==2)
   return true;
else 
 return false;
}
}


}
class rule
{
public static void main(String args[])
{ 
   Scanner nn=new Scanner(System.in);
   System.out.println("Enter number");
   int n=nn.nextInt();
   Number ob=new Number(n);

   boolean c=ob.isZero();
     System.out.println(n+"isZero::"+c);

 boolean d=ob.ispositive();
System.out.println(n+"isPositive::"+d);

boolean e=ob.isNegative();
System.out.println(n+"isNegative::"+e);

boolean f=ob.isOdd();
System.out.println(n+"isOdd::"+f);

boolean g=ob.isEven();
System.out.println(n+"isEven::"+g);

boolean h=ob.isPrime();
System.out.println(n+"isPrime::"+h);
}
} 

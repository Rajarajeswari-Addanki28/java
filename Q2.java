import java.util.*;
interface AdvancedArithmetic
{

  int divisor_sum(int n);
}
class MyCalculator implements  AdvancedArithmetic
{
 public int divisor_sum(int n)
{
   int m=n,j=0,i=1,sum=0;
   System.out.println("given number::"+m);
   for(i=1;i<=m;i++)
    {
   
 
   if(n%i==0)
   {
   System.out.println(i); 
   sum=sum+i;
    }
  else 
  {
   continue;
  }
 
  }

  return sum;
}
}
class divide
{
 public static void main(String args[])
{
 System.out.println("enter number");
  Scanner ob=new Scanner(System.in);
  int a=ob.nextInt();
  
 MyCalculator ob2=new MyCalculator();
  int c=ob2.divisor_sum(a);
System.out.println("sum is:::"+c);


}
}
 
       
   
import java.util.*;
class fibonaci
{
    public static void main(String args[])
{  
    int a,i;
    int p[]=new int[1000];
    Scanner ob=new Scanner(System.in);
   System.out.print("enter integer value");
   a=ob.nextInt();
    System.out.printf("  below  %d fibonacci series\n ",a);
    
  
   p[0]=1;
    p[1]=1;
   for(i=2;i<a;i++)
    {
      p[i]=p[i-1]+p[i-2];
    }
    for(i=0;i<=a;i++)
    {
      if(p[i]>a)
      {
         break;
       }
      System.out.println(p[i]);
       
    }
    System.out.printf("fibonacci series  %d\n",a);
   for(i=0;i<a;i++)
   {
    System.out.println(p[i]);
    }
    System.out.printf("\n %d th number in fibonnaci series::%d ",a,p[a-1]);
}
}
    
   
        
     

  
   
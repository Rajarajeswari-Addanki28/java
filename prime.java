import java.util.*;
class number
{
   public static void main(String args[])
{
  int a,i,j,c1=0,c2,k=0;
    int p[]=new int[1000];
    Scanner ob=new Scanner(System.in);
   System.out.print("enter integer value");
   a=ob.nextInt();
    for(i=1;i<=a;i++)
{  
    if(a%i==0)
     {
        c1++;
     }
}
  if(c1>2)
{
   System.out.println("not a prime");
}

  if(c1==2)
   {  System.out.printf("%d is prime\n prime numbers upto %d\n",a,a);
     
     for(i=2;i<a;i++)
      {  c2=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
               c2++;
             }
        }
        if(c2==2)
       {
         System.out.println(i);
       } 
      }

     System.out.printf("\n%d th prime number:",a);
       
        for(i=2;i<1000;i++)
      {  c2=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
               c2++;
             }
             }
        
        if(c2==2)
       {
          
           
               p[k]=i;
        	
              if(k==a-1)
		{
                 
                  
           System.out.print(p[k]);
             break;
                 
                  }
              k++;
        }



       }
      }
    
       
}
}
      

  
   
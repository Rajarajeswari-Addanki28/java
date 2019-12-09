 import java.util.*;
class factorial
{   
   int fac(int n)
  {      
     if(n==0)
         return 1;
      else{
  
       n=n*fac(n-1);
        return n;
     }
   
   }
    public static void main(String ae[])
{  

   
   int a,res;
   Scanner ob=new Scanner(System.in);
    System.out.println("Enter value");
   a=ob.nextInt();

   System.out.print("factorial ::"+a);
    
   factorial f=new factorial();
   res=f.fac(a);
   System.out.println(res);
    
    
}
  
  
}
 



import java.util.*;
class sort
{
  public static void main(String ar[])
 {  
    int i=0,j,min,temp;
    Scanner ob=new Scanner(System.in);
    System.out.print("enter length");
    int n=ob.nextInt();
    
    int a[]=new int[n];
    
    System.out.println("enter values");
    for(i=0;i<n;i++)
   {  
      Scanner ob1=new Scanner(System.in);
       a[i]=ob1.nextInt();
   }
     
       
    min=a[0];
    
    for(i=0;i<n;i++)
    {     
      for(j=0;j<n;j++)
        { 
         if(a[i]<a[j])
        {
         temp=a[i];  
         a[i]=a[j];
         a[j]=temp;
        }
         }
   }
   System.out.println("sorted array");
   for(i=0;i<=n;i++)
   {
     System.out.println(a[i]);
    }
}
}
          
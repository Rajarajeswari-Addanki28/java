import java.util.*;
class comman
{
	public static void main(String args[])
	{
		 int n,i,j,k=0,count=0,c=0;
		 

    System.out.println("enter size of 1st array");
    Scanner ob=new Scanner(System.in);
    n=ob.nextInt();
     int cl[]=new int[100];
    int a[]=new int[n];
    
    System.out.println("enter values of 1st array");
    for(i=0;i<n;i++)
   {  
      Scanner ob1=new Scanner(System.in);
       a[i]=ob1.nextInt();
   }
     
    System.out.println("enter size of 2nd array");
    Scanner ob3=new Scanner(System.in);
    int m=ob3.nextInt();

     int b[]=new int[m];
     System.out.println("enter values of 2nd array");
     for(i=0;i<m;i++)
     {	
        Scanner ob2=new Scanner(System.in);
        b[i]=ob2.nextInt();

     }

     for(i=0;i<n;i++)
     {

     	for(j=0;j<m;j++)
     	{

           if(a[i]==b[j])
           {

         cl[k]=a[i];
        
          k++;
           c=k;

           	
           
     	}
     }
 }
 System.out.println("common array");
 for(i=0;i<c;i++)
 {
  System.out.println(cl[i]);
}
     for(i=0;i<c;i++)
     {
        for(j=i+1;j<c;j++)
        {
            if(cl[i]==cl[j])
            {
            	cl[j]=-1;
            }

        }
     }
     System.out.println("common array");
 for(i=0;i<c;i++)
 {
  System.out.println(cl[i]);
}
     for(i=0;i<c;i++)
     {
       if(cl[i]==-1)
       {
       	    continue;
       }
       	count++;
       	System.out.println("common element is::"+cl[i]);

     }

  
     if(count==0)
     {
         System.out.println("NO common elements");
     }
     else
     {
     System.out.println("no.of.common elements is:: "+count);
    }
	}
}
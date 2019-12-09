import java.lang.*;
class more extends Exception
{
   int a;
       more(int x)
	{
            a=x;
           }
public String toString()
{
   System.out.println( a+"is more than 100");
   return "Enter proper values";
  
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
   System.out.println( b+"is negative");
   return "Enter proper values";
  
}

}


class test
{
    static void display(int a) throws more,negative
     { 
            int c=a,sum=0;
           if(c<0)
       { 
             throw new negative(c);
        }
         if(c>100)
           {
             throw new more(c);
            }

           if(c>50)
             {
                  if(c>50&&c<60)
                 {
                      System.out.println("you got  D grade ,give  your best in next time.");
                 }
               if(c>60&&c<70)
                 {
                      System.out.println("you got  C grade ,give  your best in next time.");
                 }
            if(c>70&&c<80)
                 {
                      System.out.println("you got  B grade ,good job do hard work to get best.");
                 }
          if(c>80&&c<90)
                 {
                      System.out.println("you got A  grade ,good job ,All the best for next time");
                 }

          if(c>90&&c<100)
                 {
                      System.out.println("you got Ex  grade ,great job,keep it up");
                 }
           }
   else
   {
      System.out.println("ohh! you got remedial ,try well in next time ");
    }
             
   }
  public static void main(String args[])
   {
   
     try
      {  
   
 System.out.println("entre your marks");
 Scanner ob=new Scanner(System.in);
 int n1=ob.nextInt(); 
    display(n1);

     }
   catch(negative e)
   {

  
    System.out.println(e);
  
  
   }
  catch(more e)
  {

  
  System.out.println(e);
  
  
}
}
}
 
    
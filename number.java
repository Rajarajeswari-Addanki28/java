import java.util.*;
import java.lang.String;
class num_str
{
  public static void main(String a[])
{
  Scanner ob=new Scanner(System.in);
  System.out.println("enter string");
  String s1=ob.nextLine();
   int n=s1.length();
    int m=s1.indexOf('.');
    System.out.println("no of digits before ."); 
    System.out.println(m); 
    System.out.println("no of digits after .");
    
     System.out.println(n-m-1);
     
  
  
}
}
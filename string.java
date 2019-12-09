import java.lang.*;
import java.util.*;
class error
{
  public static void main(String args[])
{   
   char ch='j';
   String s1="hai";
  

try
{
   int b=Integer.parseInt(args[0]);
     ch=s1.charAt(b);
 
} 


catch(StringIndexOutOfBoundsException e)
{
   System.out.println(" enter only  valid index");
     int a=Integer.parseInt(args[1]);
     ch=s1.charAt(a);
}



finally
{
   System.out.println(ch);
}


}
}
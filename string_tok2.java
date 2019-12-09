import java.util.*;
class string_tok2
{
  public static void main(String a[])
{  int count=0;
   StringTokenizer ob=new StringTokenizer("a b c d e f,g",",",true);
  int n=ob.countTokens();
 System.out.println(n);
   while(ob.hasMoreTokens())
{
 
  String m=ob.nextToken();
  System.out.println(m);
  count++;
}
 System.out.println(count);
 
  
 }
} 
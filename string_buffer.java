import java.util.*;
class string_buffer
{
  public static void main(String a[])
{  
   StringBuffer ob=new StringBuffer("nevergiveup");
  
     
     System.out.println(ob.substring(0));
    StringBuffer s1=ob.append("meow");
    System.out.println(s1);
    System.out.println(ob.reverse());
    System.out.println(ob.insert(2,"bow"));
    System.out.println(ob.delete(2,6));
    System.out.println(ob.replace(1,4,"jjjj"));
    System.out.println(ob.length());
    System.out.println(ob.capacity());
    

  
  
 }
} 
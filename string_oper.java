import java.util.*;
class string_oper
{
  public static void main(String ar[])
{
  Scanner ob=new Scanner(System.in);
  String a;
  System.out.println("enter string");
  a=ob.nextLine();
  
  
   Scanner ob1=new Scanner(System.in);
  String b;
  System.out.println("enter string");
  b=ob1.nextLine();

   
   
   System.out.println(a.compareTo(b));
   System.out.println(a.compareToIgnoreCase(b));
   System.out.println(a.equals(b));
  int n=a.length();
  int m=b.length();
  System.out.println(n);
  System.out.println(m);
  System.out.println(a.concat(b));
    System.out.println(a.replace('a','x'));
   System.out.println(a.replace("aj","yzo"));
   System.out.println(a.replace("ra","op")); 
   System.out.println(a.replaceFirst("ra","op"));
   System.out.println(a.replaceAll("rajarajeswari","ooo"));
 
  System.out.println(a.startsWith("r"));
   System.out.println(a.startsWith("ra"));
   System.out.println(a.endsWith("r")); 
   System.out.println(a.endsWith("ri")); 

  System.out.println(a.substring(1,5));
   System.out.println(a.substring(2));
   



}
}
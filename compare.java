import java.util.*;

class compare
{
  public static void main(String ae[])
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
   System.out.print(a.equals(b));
}
}
   
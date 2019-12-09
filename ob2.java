import java.util.*;
class test
{
   int a;
  void read()
{
   System.out.println("enter number");

   Scanner ob=new Scanner(System.in);
   a=ob.nextInt();
   
}
void display()
{
  System.out.println(a);
}


  public static void main(String ar[])
{
   test ob=new test();
   ob.read();
  ob.display();
  ob.a=100;
 ob.display();
}
}   
   


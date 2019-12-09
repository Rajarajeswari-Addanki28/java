class A
 {
  int a;
  A()
{
  System.out.println("parent constructor");
  a=10;
}
void print()
{
 System.out.print("Parent"+a);
}
}
class B extends A
{
   int b;
    B()
   {
     System.out.println("child constructor");
   b=29;
}

   void display()
{
  System.out.print("child"+b);
}
}
 class test 
{
   public static void main(String [] args)
{
    B ob=new B();
    ob.print();
    ob.display();
}
}

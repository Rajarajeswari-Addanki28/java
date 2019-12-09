class A
 {
  int a;
  private A()
{
  System.out.println("parent constructor");
  a=10;
}
void print()
{
 System.out.println("Parent"+a);
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
void sum()
{
  System.out.println(a+b);
}
   void display()
{
  System.out.println("child"+b);
}
}
 class test 
{
   public static void main(String [] args)
{
    B ob=new B();
    ob.print();
    ob.display();
    ob.sum();
}
}

class A
 {
  int a;
void print()
{
 System.out.print("Parent"+a);
}
}
class B extends A
{
   int b;
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

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


class C extends B
{
   int c;
    C()
{
   System.out.println("sub child");
    c=40;
   }
 void show()
{ 
   System.out.println("sub class"+c);
}
void add()
{
  System.out.println(a+b+c);
}
}

  
 class test 
{
   public static void main(String [] args)
{
    C ob=new C();
    ob.print();
    ob.display();
    ob.sum();
   ob.show();
ob.add();
}
}

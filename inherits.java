class A
 {
  
void print()
{
 System.out.print("Parent");
}
}
class B extends A
{
  
   void display()
{
  System.out.print("child");
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

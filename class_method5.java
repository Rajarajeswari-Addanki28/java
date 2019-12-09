class example
{
 int a;
 example()
{
  System.out.println(a);
  a=10;
}
void display()
{
 System.out.println(a);
}
}
class ex_p
{
public static void main(String ads[])
{
example ob1=new example();
ob1.display();
example ob2=ob1;
ob1.a=40;
ob2.display();
ob2.a=50;
ob1.display();
ob2.display();
}
}
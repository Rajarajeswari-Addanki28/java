class outer
{
  int a;
  outer()
{
  a=10;
}
class inner
{
  void display()
{
 System.out.println(a);
}
}
void show()
{
 inner ob=new inner();
ob.display();
}
}
class test_p1
{
public static void main(String as[])
{
  outer ob=new outer();
  outer.inner ib=ob.new inner();
  ib.display();
}
}

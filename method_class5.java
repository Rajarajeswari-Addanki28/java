class test
{
  int a;
  void display()
{
  System.out.println(a);
}
test()
{
      System.out.println("hello");
	System.out.println(a);
}
}
class p
{
    public static void main(String ar[])
{
    test ob1=new test();
 ob1.a=10;
ob1.display();
 test ob2=new test();
 ob2.display();
  ob2.a=20;
  ob2.display();
ob1.display();
 ob1.a=50;
 ob1.display();
ob2.display();
  
}
}
  
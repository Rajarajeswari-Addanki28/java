class test3
{
   int a;
  void test()
{
  System.out.println(a);
  }
 void display(int a)
{
   System.out.println(a);
}
}
class t_p
{
  public static void main(String ao[])
{
  test3 ob=new test3();
 ob.a=10;
ob.display(30);
}
}
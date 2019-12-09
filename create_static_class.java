class outer
{
  static int a;
   static class inner
{
  void show()
{
   System.out.println(a);
}
}
}
class test_static
{
  public static void main(String au[])
{
   outer.inner ib=new outer.inner();
   ib.show();
}
}
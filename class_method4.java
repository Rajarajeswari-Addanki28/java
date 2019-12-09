class test
{
  int a;
 test()
{
 this(10);
 System.out.println("HI");
 }
test(int x)
{
   
  a=x;
  System.out.println(a);

}
}
class tested
{
  public static void main(String ai[])
{
test ob=new test();
}
}
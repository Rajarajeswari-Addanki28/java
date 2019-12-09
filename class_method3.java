class test
{
  int a;
 test()
{
 System.out.println("HI");
 }
test(int x)
{
  this(); 
  a=x;
  System.out.println(a);

}
}
class tested
{
  public static void main(String ai[])
{
test ob=new test(10);
}
}
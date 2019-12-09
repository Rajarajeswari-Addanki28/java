class test
{   
   int a;
   test()
{
  System.out.println(a);
}
   test(int x)
{

a=x;
System.out.println(a);
}
}
 class error_prom
{
  public static void main(String ar[])
{
    test ob=new test();
     test ob2=new test(5);
}
}
class test
{
int a;
 void type2(int x)
{
  a=x;
  System.out.println(a);
 }
int type3()
{
 a=50;
  return a;
}
 
int type4(int x)
{
  a=x;
  return a;
}
}
class test_p
{
   public static void main(String as[])
{
test ob=new test();
ob.type2(100);
int c=ob.type3();
System.out.println(c);
System.out.println(ob.type4(1000));
}
}
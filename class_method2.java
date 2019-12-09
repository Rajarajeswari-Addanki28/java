class example
{
 int a;
 example()
{
a=10;
  System.out.println(a);
  
}
example  display(example ob)
{
 ob.a=ob.a+30;
 return ob;
}
}
class exa_p
{
public static void main(String ads[])
{
example ob1=new example();

example ob2;

ob2=ob1.display(ob1);
System.out.println(ob2.a);
ob1.a=50;
ob1=ob2.display(ob1);
System.out.println(ob1.a);
}
}
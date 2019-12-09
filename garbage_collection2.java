class garbage
{
  int a;
protected void finalize()
{
  System.out.println("object"+this);
}
garbage()
{
  System.out.println(a);
}
public static void main(String ad[])
{
  garbage ob1=new garbage();
  garbage ob2=new garbage();
  garbage ob3=new garbage();
  System.out.println(ob1+" "+ob2+" "+ob3);
  ob1=null;
  System.gc();
ob2=ob3;
 System.gc();
}
}
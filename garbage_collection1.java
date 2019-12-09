class garb
{
  int a;
protected void finalize()
{
  System.out.println("object"+this);
}
garb()
{
  System.out.println(a);
}
public static void main(String ad[])
{
  garb ob=new garb();
  System.out.println(ob);
ob=null;
System.gc();
}
}
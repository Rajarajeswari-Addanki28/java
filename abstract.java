class A
{
	int a=10;
}
class B extends A
{
	int a=20;
	public static void main(String args[])
	{
         A ob=new B();
         System.out.println(ob.a);
      

	}

}
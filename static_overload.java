class A
{
	static void display()
	{

		System.out.println("A");
	}
}
class B extends A{

	static void display()
	{
		System.out.println("B");
	}
}
class test
{
	public static void main(String args[])
	{
      A ob =new A();
       ob.display();
       A ob1 = new B();
       ob1.display();

	}
}
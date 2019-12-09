class a
{
	int a;
	a()
	{
		System.out.println("parent_constructors");
		a=10;
	}
	void print()
	{
		System.out.println("parent"+a);
	}
}
class b 
{
	int b;
	b()
	{
		System.out.println("child_constructors");
		b=20;
	}
	void sum()
	{
		System.out.println(a+b);
	}
	void display()
	{
		System.out.println("child"+b);
	}
}


class c extends a and b
{

	int c;
	c()
	{
		System.out.println("sub child");
		c=40;
	}
	void show()
	{ 
		print();
		display();
		System.out.println("subclass"+c);
	}
	void add()
	{
		System.out.println(a+b+c);
	}
}
class test
{
	public static void main(String ar[])
	{
		c ob=new c();
		ob.print();
		ob.show();
		ob.add();
	}
}
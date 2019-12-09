class example
{
	int a,b;
	example()
	{
		a=10;
		b=20;
	}
	void display(example ob)
	{
		a=ob.a+10;
		b=ob.b+30;
		System.out.println(a+" "+b);
	}
}
class Main
{	
	public static void main(String ar[])
	{
	example ob1 = new example();
	example ob2 = new example();
	ob1.display(ob1);
	System.out.print(ob1.a+ " "+ob1.b);
	}
}
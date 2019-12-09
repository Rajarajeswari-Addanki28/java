class example
{
	int a,b;
	example()
	{
		a=10;
		b=20;
	}
	void display(int a,int b)
	{
         	a=a+5;
		b=b+10;
		System.out.println(a+" "+b);
	}
}
class Main
{
	public static void main(String ar[])
	{
		int a=15,b=60;
		System.out.println(a+" "+b);
		example ob = new example();
		ob.display(a,b);
		System.out.print(a+" "+b);
	}
}
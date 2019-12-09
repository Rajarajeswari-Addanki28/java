class test
{	
	int a;
	void display(int a)
	{
		System.out.println("The value of the object variable is : "+a);
	}
}
class Main
{
	public static void main(String ar[])
	{
		test obj = new test();
		obj.a=20;
		obj.display(obj.a);
	}	
}
class test<E>
{
	E t;
	void display()
	{
		System.out.println(t);

	}
	void set(E a)
	{
		t=a;
	}
}
class hohr
{
	public static void main(String[] args) {
		test ob=new test();
		
		
		ob.set(10);
		ob.display();
		   ob.set(56.5);
		ob.display();
		 ob.set("meow");
		ob.display();
			}
}
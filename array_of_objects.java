class test
{    int g;
	test(int x)
	{
		g=x;
		System.out.println(g);
	}
	void display()
	{g=20;
		System.out.println("hello"+g);
	}
	void print()
	{g=g+100;
		System.out.println("hii"+g);
	}
}
class testing
{
	public static void main(String[] args) {
		int i;
		test a[]=new test[10];
		int b=a.length;
		System.out.println(b);
		for(i=0;i<b;i++)
		{
			a[i]=new test(10);
		}
		for(i=0;i<b;i++)
		{
			a[i].display();
			a[i].print();
      }
	

	}
}
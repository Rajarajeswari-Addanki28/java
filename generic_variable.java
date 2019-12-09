class test<T>
{
	T t;
	void display()
	{
		System.out.println(t);

	}
}
class t_p
{
	public static void main(String[] args) {
		test ob=new test();
		ob.t=10;
		System.out.println(ob.t);
		ob.t=20.5;
		System.out.println(ob.t);
		ob.t="meow";
		System.out.println(ob.t);	}
}
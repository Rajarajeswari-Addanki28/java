class test<E>
{
	E t,u;
	void display()
	{
		System.out.println(t);

	}
	void set(E a,E b)
	{
		t=a;
        u=b;
       if(E=String) 
       {
       	System.out.println(t+u);
       }
       else
       {
       	System.out.println(t+u);
       	System.out.println(t-u);
       	System.out.println(t*u);
       }
	}
}
class t_p
{
	public static void main(String[] args) {
		test ob=new test();
		
		
		ob.set(10,20);
		ob.display();
		   ob.set(56.5);
		ob.display();
		 ob.set("meow");
		ob.display();
			}
}
interface A
{
    void display();   
}


interface B extends A{
	
	void print();
}


class C implements A{
	public void display()
      {
System.out.println("Interface A");
}  

}


class D implements B {
public void display()
      {
System.out.println("Interface A");
}  

public void print()
	{

	System.out.println("Interface B");	
	}

}


class ooo
{
	public static void main(String args[])
	{

		C ob =new C();
		ob.display();
		D ob2=new D();
		ob2.display();
         ob2.print();
	}
}


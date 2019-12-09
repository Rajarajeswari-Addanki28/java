interface A
{
	
   static void display(); 
}
class B implements A
{
    
      void display()  //default is working;
	{
		System.out.println("HAI");
	}
	
}
class op
{
public static void main(String args[])
	{
		B ob=new B();
		A.display();
	}

}
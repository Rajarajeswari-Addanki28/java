interface A
{
   void display1();
 default void display()
{
 
   System.out.println("heee");
	
}
  
}
class B implements A
{
   public void display1()	
  {
    System.out.println("HAI");
	}

}
 class capap
{
     public static void main(String args[])
	{
		A ob=new B();
		ob.display();
               ob.display1();
	}

}

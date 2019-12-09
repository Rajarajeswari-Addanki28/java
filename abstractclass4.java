abstract class  apple
{ 
	
	apple()
	{
	System.out.println("this is constructor of abstract class");
    }
    
    abstract void a_method();

     void B()
     {
     	System.out.println("This is normal method  of abstract class ");

     }



}

class SubClass extends meow
{  
    void a_method()
    {
    	System.out.println("This is abstract method");
    }
}

class testt
{
	public static void main(String[] args) {
		
		
		SubClass ob1=new SubClass();
		ob1.B();
		ob1.a_method();
	}
}

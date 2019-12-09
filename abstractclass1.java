 abstract class parent 
{
   abstract void message();

}
class subclass1 extends parent
{ 
    void message()
    {
        System.out.println("This is first subclass ");
    }

}
class subclass2 extends parent
{
	 void message()
    {
        System.out.println("This is second subclass ");
    }
}
class tests
{
	public static void main(String args[])
	{
       subclass1 ob=new subclass1();
       subclass2 ob1=new subclass2();
        ob.message();
        ob1.message();

	}
}
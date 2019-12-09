class test_thread extends Thread
{
public void run()
{
  
 System.out.println("run::oops");

  
}
}
class test
{ 
   public static void main(String args[])
{
  test_thread ob=new test_thread();
  ob.start(); //ob.run
   System.out.println("current Thread::"+ob.currentThread());
  System.out.println("default thread name::"+ob.getName());
ob.setName("orange");
System.out.println("after set name::"+ob.getName()); 
  System.out.println("current Thread::"+ob.currentThread());

}
}


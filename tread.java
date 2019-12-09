class test_thread extends Thread
{
public void run()
{
  System.out.println("HELO");
}
}
class test
{ 
   public static void main(String args[])
{
  test_thread ob=new test_thread();
  ob.start(); //ob.run
  System.out.println(Thread.MAX_PRIORITY);
  System.out.println(Thread.MIN_PRIORITY);
 System.out.println(Thread.NORM_PRIORITY);
 System.out.println(ob.getPriority());
ob.setPriority(7);
System.out.println(ob.getPriority());
}
}

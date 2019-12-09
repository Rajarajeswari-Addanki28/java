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
  try
{
   System.out.println("hai");
   Thread.sleep(50000); 
   System.out.println("hello");
   }
  
  catch(Exception e)
  {
    System.out.println(e);
    }
}
}


class A implements Runnable
{
  public void run()
  {
for(int i=0;i<5;i++)
   System.out.println("Thread-A started");
   
  }

}

class B extends A implements Runnable
{
  public void run()
  {
  super.run();
for( int i=0;i<5;i++)
   System.out.println("Thread-B started");
  
}

}



class testing
{

  public static void main(String args[])
{
   B ob2=new B();

ob2.run();

}
}
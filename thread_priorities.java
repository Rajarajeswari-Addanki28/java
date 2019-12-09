class A extends Thread
{
  public void run()
  {
for(int i=0;i<5;i++)
   System.out.println("Thread-A started");
   
  }

}

class B extends Thread
{
  public void run()
  {
for( int i=0;i<5;i++)
   System.out.println("Thread-B started");
  
}

}

class C extends Thread
{
  public void run()
  {
for(int i=0;i<5;i++)
   System.out.println("Thread-C started");
   
}

}

class testing
{

  public static void main(String args[])
{
   A ob1=new A();
   B ob2=new B();
   C ob3=new C();
ob1.setPriority(Thread.MIN_PRIORITY);
System.out.println("A"+ob1.getPriority());

System.out.println("B"+ob2.getPriority());
ob3.setPriority(Thread.MAX_PRIORITY);
System.out.println("C"+ob3.getPriority());
ob1.start();
ob2.start();
ob3.start();
}
}
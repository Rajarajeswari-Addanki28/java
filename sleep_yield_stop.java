class A extends Thread
{
  public void run()
  {
   System.out.println("Thread-A started");
   for(int i=0;i<5;i++)
   {
      if(i==1)
         yield();
     System.out.println("Thread A-i"+i);

  }
   System.out.println(" end of Thread A");
}

}

class B extends Thread
{
  public void run()
  {
   System.out.println("Thread-B started");
   for(int j=10;j<15;j++)
   {
      if(j==14)
         stop();
     System.out.println("Thread B-j"+j);

  }
   System.out.println(" end of Thread B");
}

}

class C extends Thread
{
  public void run()
  {
   System.out.println("Thread-C started");
   for(int k=100;k<105;k++)
   {
      
     System.out.println("Thread C-k"+k);
     try
{
    sleep(2000);

  
}
catch(Exception e)
{
  System.out.println(e);
}


  }
   System.out.println(" end of Thread C");
}

}

class testing
{

  public static void main(String args[])
{
   A ob1=new A();
   B ob2=new B();
   C ob3=new C();
ob1.start();
ob2.start();
ob3.start();
}
}
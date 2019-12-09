 class apple extends Thread
{
  public void run()
  {
   System.out.println("Thread-t1 started");
  
  }
  

}

class artist extends Thread
{
  public void run()
  {
   System.out.println("Thread-t2 started");
  
}

}

class alll extends Thread
{
  public void run()
  {
   System.out.println("Thread-t3 started");
   
}

}

class zebra
{

  public static void main(String args[])
{
   apple t1=new apple();
    artist t2=new artist();
   alll t3=new alll();
t1.start();
t2.start();
t3.start();
 System.out.println("t1 isalive::"+t1.isAlive());
System.out.println("t2 isalive::"+t2.isAlive());
System.out.println("t3 isalive::"+t3.isAlive());
 try{
 t1.join();
t2.join();
t3.join();
}
 catch(Exception e)
{

System.out.println(e);
}
System.out.println("t1 after join isalive::"+t1.isAlive());
System.out.println("t2 after join isalive::"+t2.isAlive());
System.out.println("t3  after join isalive::"+t3.isAlive());




}
}
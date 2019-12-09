class t1 extends Thread
{
  public void run()
  {
   System.out.println("Thread-t1 started");
  
  }
  

}

class t2 extends Thread
{
  public void run()
  {
   System.out.println("Thread-t2 started");
  
}

}

class t3 extends Thread
{
  public void run()
  {
   System.out.println("Thread-t3 started");
   
}

}

class testing
{

  public static void main(String args[])
{
   t1 ob1=new t1();
   t2 ob2=new t2();
   t3 ob3=new t3();
ob1.start();
ob2.start();
ob3.start();
 System.out.println("t1 isalive::"+ob1.isAlive());
System.out.println("t2 isalive::"+ob2.isAlive());
System.out.println("t3 isalive::"+ob3.isAlive());
 try{
 ob1.join();
}
 catch(Exception e)
{

System.out.println(e);
}
System.out.println("i1 after join isalive::"+ob1.isAlive());




System.out.println("jt2 isalive::"+ob2.isAlive());
 try{
 ob2.join();
}
 catch(Exception e)
{

System.out.println(e);
}
System.out.println("t2 after join isalive::"+ob2.isAlive());




System.out.println("jt3 isalive::"+ob3.isAlive());
 try{
 ob3.join();
}
 catch(Exception e)
{

System.out.println(e);
}
System.out.println("t3 after join isalive::"+ob3.isAlive());
}
}
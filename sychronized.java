class tesrt extends Thread
{
  int i;
synchronized public void display(int n)
{
  for(i=0;i<n;i++)
 {
  System.out.println(i);
 }
try
{
 sleep(10000);
 }
 catch(Exception e)
{
  System.out.println(e);
}
}
}
class t1 extends Thread
{
   tesrt ob;
  t1(tesrt ob)
   {
     this.ob=ob;
}
      
  public void run()
  {
    System.out.println("Thread1");
    ob.display(10);
  }
}
class t2 extends Thread
{

  
   tesrt ob;
  t2(tesrt ob)
   {
     this.ob=ob;
}
  public void run()
{
  System.out.println("Thread2");
  ob.display(20);
}
}
class tention
{
 public static void main(String args[])
{
  tesrt ob=new tesrt();
   t1 y=new t1(ob);
   t2 z=new t2(ob);
  y.start();
  z.start();
}
}
   

 class apple extends Thread
{
  public void run()
  {
   System.out.println("Thread-t1 started");
  
  }
}
class zebra
{

  public static void main(String args[])
{
   apple t1=new apple();
   
System.out.println("isdeamon::"+t1.isDaemon());
t1.setDaemon(true);
System.out.println("isdeamon::"+t1.isDaemon());

}
 }
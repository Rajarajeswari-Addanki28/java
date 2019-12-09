class A extends Thread
{
   public  void run()
  {
   
   System.out.println("SUSPENDED");
}

}


class testing
{

  public static void main(String args[])
{
   A ob1=new A();
ob1.start();
ob1.suspend();
ob1.resume();

 
}
}
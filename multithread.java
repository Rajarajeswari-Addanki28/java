class testthread extends Thread
{
public void run()
{
  int i;

for(i=0;i<5;i++)
{
 System.out.println(Thread.currentThread().getId());//getName()
 System.out.println(i);
 try
{
  Thread.sleep(5000);
}
catch(Exception e)
{
   System.out.println(e);
}

 } 
}
}
class test1
{ 
   public static void main(String args[])
{
  testthread ob1=new testthread();
  testthread ob2=new testthread();
  ob1.start(); //ob.run
   
  ob2.start(); //ob.run
   

}
}


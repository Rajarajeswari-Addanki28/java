class testthread extends Thread
{
public void run()
{
  int i;

for(i=0;i<5;i++)
{
 System.out.println(Thread.currentThread().getName());
 System.out.println(i);
 try
{
  Thread.sleep(2000);
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
  ob1.run(); 
   
  ob2.run(); 
   

}
}


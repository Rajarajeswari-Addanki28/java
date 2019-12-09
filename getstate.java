class tthread extends Thread
{
public void run()
{
  
 System.out.println("run::oops");
 
}
}
class test
{ 
   public static void main(String args[])
{
  tthread ob=new tthread();
System.out.println("main"+ob.getState());
  ob.start(); //ob.run
   
  System.out.println("startmain"+ob.getState());
 try
{
  ob.sleep(5000);
   System.out.println("main trysleep"+ob.getState());

}
catch(Exception e)
 {
  System.out.println(e);
}

System.out.println("bstop"+ob.getState());
 ob.stop();
System.out.println("astop"+ob.getState());
}

 
}


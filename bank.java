class bank
{
  int balance=1000;
  synchronized void withdraw(int amount)
  {
    
    
 System.out.println(" withdraw"); 
     if(amount>balance)
      {
         System.out.println("insuffiecient balance"+balance);
         try
         {
         wait();
          }
     catch(Exception e)
        {
          System.out.println(e);

     }
}
    else
    {
       balance=balance-amount;
       System.out.println("successful withdraw"); 
       System.out.println("balance amount::"+balance); 
       }
   System.out.println("thanks "); 
  }
   synchronized void deposite(int amount)
{
 System.out.println("deposite"); 
       balance=balance+amount;
       System.out.println("deposite successfully");
       System.out.println("current balance:: "+balance); 
        notify();
     System.out.println("Thanks for  deposite");  
}
}
class transcation extends Thread
{
  public static void main(String args[])
  {  
      bank ob=new bank();
     new Thread()
    {
   public void run()
   {

      ob.withdraw(2000);
   }

}.start();

 new Thread()
    {
   public void run()
   {
ob.deposite(5000);
      
   }

}.start();
      
}
}
      
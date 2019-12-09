abstract class Bank
{
	abstract void getBalance();
}
class BankA extends Bank 
{
	void getBalance()
	{

		System.out.println("$100");
	}

}
class BankB extends Bank
{
	void getBalance()
	{

		System.out.println("$150");
	}

}
class BankC extends Bank
{
	void getBalance()
	{

		System.out.println("$200");
	}

}
class banking
{
 public static void main(String[] args) {
	
	BankA ob=new BankA();
	BankB ob1=new BankB();
	BankC ob2=new BankC();
      ob.getBalance();
      ob1.getBalance();
      ob2.getBalance();

	}
}
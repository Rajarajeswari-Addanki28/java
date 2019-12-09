class testee
{
  void voter(int age)throws Exception
{
  if(age>18)
   {
       System.out.println("Eligible");
   }
  else
     throw new Exception();
}
public static void main(String args[])
{
  testee ob=new testee();
   int n1=Integer.parseInt(args[0]);

 try
{
  ob.voter(n1);
  }
catch(Exception e)
{
  int k=18-n1;
  System.out.println(k+" year more to get vote");
}
}
}
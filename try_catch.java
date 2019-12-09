class exception
{
   public static void main(String args[])
{
    int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);

 try
{
   System.out.println(a/b);
}

catch(ArithmeticException e)
{
   System.out.println("give only non zere numbers");
}

finally
{

   System.out.println("kkokijkok");
}
 
}
}
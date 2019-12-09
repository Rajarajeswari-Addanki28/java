class exception
{
   public static void main(String args[])
{
try
{
    int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   System.out.println(a/b);
}

catch(ArrayIndexOutOfBoundsException e)
{
       System.out.println(" give atleast 2 arguements");
}


catch(NumberFormatException e)
{
     System.out.println("only integers");
}


catch(ArithmeticException e)
{
   System.out.println(e);
   System.out.println("give only non zere numbers");
}


}
}
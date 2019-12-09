class exception
{
   public static void main(String args[])
{
try
{
    int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   
     try{
        int d=2/0;
        }

     catch(ArithmeticException e)
    {
   System.out.println(e);
   System.out.println("give only non zere numbers");
    }
   try
{

   int arr[]=new int[3];
   arr[10]=100;
}
  catch(ArrayIndexOutOfBoundsException e)
{
       System.out.println(" array size exceeded");
}
   
}

catch(ArrayIndexOutOfBoundsException e)
{
       System.out.println(" give atleast 2 arguements");
}


catch(NumberFormatException e)
{
     System.out.println("only integers");
}





}
}
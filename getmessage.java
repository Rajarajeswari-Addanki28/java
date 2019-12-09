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

catch(Exception e)
{     
  System.out.println(e);
       System.out.println(e.getMessage());
     System.out.println(e.getCause());
}



}
}
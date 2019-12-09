class tree
{
   public static void main(String args[])
{
   int age=Integer.parseInt(args[0]);

   try
   { 
      if(age<18)
       {
          throw new Exception("not eligible");
        }
 	else
	  System.out.println(" Eligible");
}
  catch(Exception e)
  {
     System.out.println(e.getMessage());
      System.out.println(e);
}
}
}
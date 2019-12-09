class voter
{
   public static void main(String args[])
{
   int age=Integer.parseInt(args[0]);

   try
   { 
      if(age<18)
       {
          throw new Exception();
        }
 	else
	  System.out.println(" Eligible");
}
  catch(Exception e)
  {
    
     System.out.println((18-age)+"is more to get vote ");

}
}
}
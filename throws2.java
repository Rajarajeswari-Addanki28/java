class plant
{

   void display(int a,int b) throws Exception
   {
      int c=a/b;
      System.out.println(c);

   }



   public static void main(String args[])
{
    plant ob =new plant();

  try{

   int n1=Integer.parseInt(args[0]);
   
   int n2=Integer.parseInt(args[1]);
   
    
   try
   { 
     ob.display(n1,n2);
     
    }
  catch(Exception e)
  {
     
      System.out.println(e);
}
} 

 catch(Exception e)
{
   System.out.println("Enter min 2 arguements ");
}


}
}
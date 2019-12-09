class A
{
 final void display()
{

  System.out.println("parent");
}
}

class B extends A
{
   void display()
  
{
   super.display();
  System.out.println("child");

}
}


class test
{
  public static void main(String args[])
{

  B ob=new B();
ob.display();
}


}




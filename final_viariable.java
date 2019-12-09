class A
{
  void display()
{

  System.out.println("parent");
}
}

class B extends A
{  
   void display()
  

{final int a=10;  
  
   super.display();
  System.out.println("child");
 a=20;
System.out.println(a);

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




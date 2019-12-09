class A
{    
    final int b=20;
  void display()
{
   b=90;
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




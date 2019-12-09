class A
 {
  int a;
 A()
{
  System.out.println("parent constructor");
  a=10;
}
void print()
{
 System.out.println("Parent::"+a);
}

}


class B extends A
{
   int a;
    B()
   {
     System.out.println("child constructor");
   a=29;
}

   void print()
{
   
   
  System.out.println("child::"+a);
  super.print();
 
}
}



  
 class test 
{
   public static void main(String [] args)
{
   
    B ob=new B();
    ob.print();
   
}
}

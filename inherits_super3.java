class A
 {
  int a,b;
 A(int x, int y)
{
  System.out.println("parent");
  a=x;
b=y;
 System.out.println("end of parent");
}
void print()
{
  System.out.println("parent sum::");
 System.out.println(a+b);
}

}


class B extends A
{
   int c;
    B(int p,int q,int r)
   {
      super(p,q);
     System.out.println("child");
     c=r;
   System.out.println("end of child");
   
  
}

   void display()
{
   
  System.out.println("child sum"); 
  System.out.println(a+b+c);
  
 
}
}



  
 class test 
{
   public static void main(String [] args)
{
   
    B ob=new B(10,20,30);
    ob.display();
    ob.print();
  System.out.println("end of programm");
   
}
}

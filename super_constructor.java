class A
 {
  int a;
 A(int x)
{
 
  a=x;
System.out.println("parent ::"+a);

}

}


class B extends A
{
   int b,c;
    B(int x,int y,int z)
   { 
super(z);
    b=x;
    c=y;
      
System.out.println("child B ::"+b);
System.out.println("child B::"+c);
}
     
   
  
}

class C extends B
{
   int d;
int e=40;
    C(int p,int q,int r,int s)
   {
      super(p,q,r);
      d=s;
     
     System.out.println("child C::"+d);
    
  
}


}



  
 class test 
{
   public static void main(String [] args)
{
   
    C ob=new C(10,20,30,40);
   
   
}
}

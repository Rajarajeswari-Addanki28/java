class area
{  
  
  int l,b;
  double r ,h,bre;
  
   area(double x,double y)
{     bre=x;
      h=y;

    System.out.println("triangle area::"+0.5*bre*h);
}
 area(double x)
{   r=x;
  System.out.println("circle area::"+Math.PI*r*r);
}
  area(int x,int y)
{
   l=x;
   b=y;
  System.out.println("rectangle area::"+l*b);
}
}
  
class constructor
{
  public static void main(String ar[])
{
  area ob=new area(23.354);
  area ob1=new area(23,45);
  area ob2=new area(4.4,6.55);

}
}
   
  
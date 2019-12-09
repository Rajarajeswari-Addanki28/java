class geometry
{  
  
  int l,b;
  double r ,h,bre;
  
   void area(double x,double y)
{     bre=x;
      h=y;

    System.out.println("triangle area::"+0.5*b*h);
}
void area(double x)
{   r=x;
  System.out.println("circle area::"+Math.PI*r*r);
}
  void area(int x,int y)
{
   l=x;
   b=y;
  System.out.println("rectangle area::"+l*b);
}
}
  
class method
{
  public static void main(String ar[])
{
  geometry ob=new geometry();
  ob.area(4.5);
   ob.area(4,80);
   ob.area(45.67,87.534);

}
}
   
  
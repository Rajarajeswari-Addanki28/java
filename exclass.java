class point
{
   private int x,y;
  point()
  {
   System.out.println("main point");
   }

   point(int x,int y)
  {
   System.out.println("main point"+x*y);
   }
 
 
  void setX(int x)
{
   System.out.println(x);
}
void setY(int y)
{
 System.out.println(y);
}

void displayXY(int x,int y)
{
 System.out.println(x +" "+ y);


}
public static void main(String args[])
{
  point ob= new point(); 
  point or=new point(90,90);
  ob.setX(10);
  ob.setY(20);
  ob.displayXY(20,10);
}
}
class fruit
{
   int a,b;
  void teja()
{
   
  System.out.println("teja is good or bad");
  }

}
class apple extends fruit
{
    void teja()
{
   super.teja();
  System.out.println("good");
    
  }
 void teja(int x,int y)
{

  a=x;
   b=y;
 System.out.printf("\nteja marks %d",a+b);
}
}
class orange
{
  public static void main(String args[])
{
  apple ob=new apple();
   ob.teja();
  ob.teja(10,80);
   
     }
}
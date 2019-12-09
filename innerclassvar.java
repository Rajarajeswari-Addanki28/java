class outer
{
  int a;
 
   outer()
{
 a=10;
}

  void display()
{
  for(int i=0;i<10;i++)

{ 
 class inner
{  
void show()
{
  System.out.println(a);
}
}

 inner ob=new inner();
  ob.show();
System.out.println(ob);
}
}
}
class test_out
{
  public static void main(String auo[])
{
  outer ob=new outer();
  ob.display();
}
}

 
 

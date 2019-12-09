abstract class figure
{
   abstract void area();

void display()

{  
    System.out.println("circle,rectangle");
}


}
 class circle extends figure
{
   
   double r;
  circle()
{
   r=10.5;
}
   void area()

{    
  System.out.println(Math.PI*r*r);

}
    
} 
class rectangle extends figure
{
    int l,b;
rectangle()
{
  l=10;
  b=8;
  
}
void area()
{

  System.out.println(l*b);
}

}

class TEST
{
   public static void main(String args[])
{  
    circle cob=new circle();
  cob.display();
  cob.area();
rectangle rob=new rectangle();
rob.display();
rob.area();

}
}





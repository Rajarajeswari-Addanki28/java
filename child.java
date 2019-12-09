package child;
import parent.parent;
public class child extends parent
{

    int a=10;
  int b=20;
void mul()
{
System.out.println("child"+a*b);
}
  
}
class newe
{
public static void main(String args[])
{
  child ob=new child();
   ob.sum();
   ob.mul();
}
}

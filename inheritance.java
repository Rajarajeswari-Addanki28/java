import java.util.*;
class animal
{
   String  breed;
   String name;
   int sleep_hours;
  void input()
{  System.out.println("enter breed");
   Scanner ob=new Scanner(System.in);
   breed=ob.nextLine();
  
   System.out.println("enter name");
   Scanner ob1=new Scanner(System.in);
   name=ob1.nextLine();

  System.out.println("enter sleep_hours");
   Scanner ob2=new Scanner(System.in);
   sleep_hours=ob2.nextInt();

}

void output()
{
   System.out.println(breed);
    System.out.println(name);
   System.out.println(sleep_hours);
}
}

class cat extends animal
{

void take()
{  System.out.println("cat");
  input(); 
}
void give()
{
   output();
  System.out.println("meow meow meow");
}
}


class dog extends animal
{
   void input()

{ System.out.println("dog");
   super.input();
   
}
void print()
{
  output();
  System.out.println("bow bow bow");
}
}
 
class proof
{

  public static void main(String args[])
{

   cat c=new cat();
   c.take();
  c.give();
 dog d=new dog();
    d.input();
    d.print();
}
}
 

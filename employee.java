import java.util.*;
class employee
{  
   int id;
   String n;
   int s;
   
  void read()
{  

   System.out.println("enter name");
   System.out.println("enter id");
   System.out.println("enter salary");
   Scanner ob=new Scanner(System.in);
    n=ob.nextLine();
   id=ob.nextInt();
    
    s=ob.nextInt();
   
   
   
   
}
void display()
{
  System.out.println("id ::"+id);
  System.out.println("name::"+n);
  System.out.println("salary::"+s);
}


  public static void main(String ar[])
{
   employee ob=new employee();
   ob.read();
  ob.display();
  
  
}
}   
   


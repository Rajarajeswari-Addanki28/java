import java.util.*;
class person
{
   String name;
   String Address;
   Long contact;
  void read()
{  System.out.println("enter name::");
   Scanner ob=new Scanner(System.in);
   name=ob.nextLine();
   
    System.out.println("enter Address::");
   Scanner ob1=new Scanner(System.in);
   Address=ob1.nextLine();
   
   System.out.println("enter contact::");
   Scanner ob2=new Scanner(System.in);
   contact=ob2.nextLong();
  
  }
void display()
{
  System.out.println("NAME:::"+name);
  System.out.println("ADDRESS:::"+Address);
   System.out.println("CONTACT:::"+contact);

   
}
}

class student extends person
{
    int id;
    int classname;
 void input()
{     read();
     
     System.out.println("enter id::");
      Scanner b=new Scanner(System.in);
   id=b.nextInt();
 
    System.out.println("enterclassroom::");
   Scanner b1=new Scanner(System.in);
   classname=b1.nextInt();
  }
 void output()
{
   display();
   System.out.println("STUDENT ID:::"+id);
  System.out.println("CLASS:::cse"+classname);
}
}

class employee extends person
{
    int eid;
  String edept;
 void take()
{     read();
      System.out.println("enter eid::");
      Scanner d=new Scanner(System.in);
   eid=d.nextInt();
 
    System.out.println("enter edept::");
   Scanner d1=new Scanner(System.in);
   edept=d1.nextLine();
  }
 void show()
{
   display();
   System.out.println("EMPLOYEE ID:::"+eid);
  System.out.println("EMPLOYEE DEPARTMENT:::"+edept);
}
}

class testing
{
  public static void main(String args[])
{
    student stu=new student();
    employee emp=new employee();
   stu.input();
    stu.output();
   emp.take();
emp.show();
}
}

 
   
  
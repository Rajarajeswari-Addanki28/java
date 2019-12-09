import java.util.*;
class read_dt
{
   public static void main(String ar[])
 {
   float a;
   int b;
   double c;
   short d;
   byte e;
   char f;
   Scanner ob=new Scanner(System.in);
   System.out.println("enter float value");
   a=ob.nextFloat();
   System.out.println("entered num:"+a);

   Scanner ob1=new Scanner(System.in);
   System.out.println("enter integer value");
   b=ob1.nextInt();
   System.out.println("entered num:"+b);

   Scanner ob2=new Scanner(System.in);
   System.out.println("enter double value");
   c=ob2.nextDouble();
   System.out.println("entered num:"+c);

   Scanner ob3=new Scanner(System.in);
   System.out.println("enter short value");
   d=ob3.nextShort();
   System.out.println("entered num:"+d);

    Scanner ob4=new Scanner(System.in);
   System.out.println("enter Byte value");
   e=ob4.nextByte();
   System.out.println("entered num:"+e);

   Scanner ob5=new Scanner(System.in);
   System.out.println("enter char value");
   f=ob5.next().charAt(0);
   System.out.println("entered char:"+f);
   
}
}
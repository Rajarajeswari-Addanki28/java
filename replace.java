import java.util.*;
class replace
{
  public static void main(String ae[])
{
   Scanner ob=new Scanner(System.in);
   String a;
   System.out.println("ENTER  STRING ::");
   a=ob.nextLine();
   
   System.out.println(a.replace('a','x'));
   System.out.println(a.replace("aj","yzo"));
   System.out.println(a.replace("ra","op")); 
   System.out.println(a.replaceFirst("ra","op"));
   System.out.println(a.replaceAll("rajarajeswari","ooo"));
}

}
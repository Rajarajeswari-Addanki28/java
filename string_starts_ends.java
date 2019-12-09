import java.util.*;
class starts_end
{
  public static void main(String ae[])
{
   Scanner ob=new Scanner(System.in);
   String a;
   System.out.println("ENTER  STRING ::");
   a=ob.nextLine();
   
   System.out.println(a.startsWith("r"));
   System.out.println(a.startsWith("ra"));
   System.out.println(a.endsWith("r")); 
   System.out.println(a.endsWith("ri")); 

}
}
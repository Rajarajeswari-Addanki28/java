class cube
{
  int l,w,h;
  cube()
{
  l=10;
   w=20;
   h=30;
   }
int volume()
{
 return l*w*h;
}
}
class result
{
 public static void main(String ar[])
{
 int vol1;
cube ob=new cube();
vol1=ob.volume();

 System.out.println(vol1);
 
}
}
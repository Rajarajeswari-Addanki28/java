class cube
{
  int l,w,h;
  cube(int a,int b,int c)
{
  l=a;
   w=b;
   h=c;
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
 int vol1,vol2;
cube ob1=new cube(10,20,30);
cube ob2=new cube(10,2,1);
vol1=ob1.volume();
vol2=ob2.volume();
 System.out.println(vol1);
 System.out.printf("\n %d",vol2);
}
}
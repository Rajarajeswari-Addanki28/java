class prime
{
  public static void main(String ar[])
{
  int r,a=5,b=9;
   r=a%b;
   while(r!=0)
   {
     a=b;
     b=r;
     r=a%b;
    }
    if(b==1)
      System.out.println("coprime");
    else
      System.out.println("not a coprime");
}
}
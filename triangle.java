class triangle
{
  public static void main(String args[])

{
  int i,j,k;
  for(i=1;i<=5;i++)
{
for(j=i+1;j<=5;j++)
{
  System.out.print("*");
}

 System.out.printf("\t");

for(k=1;k<i;k++)
    {

  System.out.print("*");
}

System.out.printf("\t");
for(j=i+1;j<=5;j++)
{
  System.out.print("*");
}


  System.out.printf("\n");
}
}
}

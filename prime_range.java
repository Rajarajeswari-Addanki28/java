class prime_range
{
  public static void main(String a[])
 {
   int i,n,count;
   for(n=1;n<=100;n++)
   {   count=0;
       for(i=1;i<=n;i++)
      {
         if(n%i==0)
          {   
           count++;
           }
       }
       if(count==2)
       {

      System.out.println(n);
       }

}
}
}
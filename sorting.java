class sort
{
  public static void main(String ar[])
 {  
    int i=0,j,min,temp;
    int a[]={2,5,1,3,8};
    min=a[i];
    for(i=0;i<a.length;i++)
    {     
      for(j=0;j<a.length;j++)
        { 
         if(a[i]<a[j])
        {
         temp=a[i];  
         a[i]=a[j];
         a[j]=temp;
        }
         }
   }
   for(i=0;i<a.length;i++)
   {
     System.out.println(a[i]);
    }
}
}
          
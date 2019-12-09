import java.lang.Math;
import java.util.Scanner;
import java.util.Random;
class elementry
{  
    
   public static void main(String args[])
{   
	int val=0,a,count=0,c1=0;
   
   while(true)
   {
       Random ob1=new Random();

   int  n1=ob1.nextInt(10);
   int  n2=ob1.nextInt(10);
   int  n3=ob1.nextInt(4);
    System.out.println("What is the Value of:");    
     
     switch(n3)
     {    
        case 0:
               
             System.out.printf("\n %d+%d",n1,n2);
               val=n1+n2;
               
               break;
         case 1:
             System.out.printf("\n %d-%d",n1,n2);
               val=n1-n2;
               
             
           
            break;
          case 2:
             System.out.printf("\n%d*%d",n1,n2);
               val=n1*n2;
               
                              break;
          case 3:
              System.out.printf("\n%d/%d",n1,n2);
               val=n1/n2;
               
               break;
 }


    while(true)
    {
    	System.out.println("What is the Value of:"); 
 Scanner obj=new Scanner(System.in);
   
   a=obj.nextInt();
  if(val==a)
  	   count++;
  {    Random ob2=new Random();
       int i=ob2.nextInt(5);
       switch(i)
       {
           case 0:
             System.out.println("Exellent");
             break;
       
       case 1:
             System.out.println("Great");
             break;
      case 2:
             System.out.println("Super");
             break;
       case 3:
             System.out.println("good");
             break;
       case 4:
            System.out.println("Super");
             break;
             
 


       }
       break;
       

  }
  else
  	
  
  {     
      c1++;
        Random ob3=new Random();
           int k=ob3.nextInt(5);
       switch(k)
       {
           case 0:
             System.out.println("wrong:try again");
             break;
       
       case 1:
             System.out.println("sorry:try again");
             break;
      case 2:
             System.out.println("try it once");
             break;
       case 3:
             System.out.println("you can do it");
             break;
             case 4:
            System.out.println("please try again");
             break;

  }

 
	}   
	} 

    
     if((c1+count)==10)
     {

     	break;
     }

     	 }  


     	 System.out.println("performance"+(count/10)*100);

}
}
abstract class marks
{
	abstract double getPercentage();
}
class studentA extends marks
{    double d;
     studentA(double i,double j,double k)
     {
     	 d=i+j+k;
     }
     double getPercentage()
     { 
     	
     	
     	
     	return(d/300*100);

     }

}

class studentB extends marks
{ 
	double sum;
     studentB(double w,double x,double y,double z)
     {
     	sum=w+x+y+z;
     }
     double getPercentage()
     { 
     	
     	
     	return(sum/400*100);

     }

}
class results
{
	public static void main(String[] args) {
		
		studentA ob=new studentA(90,98,98);
		studentB ob2=new studentB(98,95,94,93);
	double r=ob.getPercentage();
	double l=ob2.getPercentage();
	System.out.println("studentA percentage::");
		System.out.println(r);
		System.out.println("studentB percentage::");
		System.out.println(l);
	}
}
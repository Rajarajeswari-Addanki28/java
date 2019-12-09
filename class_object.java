class lamp
{
 boolean ison;
 void turnon()
{
  ison=true;
   }
 void turnoff()
{
  ison=false;
}
 void displaylightstatus()
{	 
 	System.out.println("Lighton??"+ison);

}
}
 class object
{
  public static void main(String ar[])
{
 lamp l1=new lamp();
 lamp l2=new lamp();
 l1.turnon();
 l2.turnoff();
l1.displaylightstatus();
l2.displaylightstatus();
}
}



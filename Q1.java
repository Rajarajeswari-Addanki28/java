class Sports
{  
   
   String getName()
    {
     return "Generic Sports";
     }
    void getNumberOfTeamMembers()
    {
  
        System.out.println("Each team has n players in "+this.getName());
     }
    
}
class Soccer extends Sports
{
  String getName()
  {
   return "Soccer Class";
   }
     void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in "+getName());
     }

}
class game
{
  public static void main(String args[])
{
  Sports obj =new Sports();
  String name = obj.getName();
  System.out.println(name);
  obj.getNumberOfTeamMembers();
  Soccer ob =new Soccer();
  String name1 = ob.getName();
  System.out.println(name1);
  ob.getNumberOfTeamMembers();
}
}
  
  
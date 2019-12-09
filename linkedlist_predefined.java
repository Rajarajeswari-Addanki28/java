import java.util.*;
class LL
{
   public static void main(String args[])
   {
     LinkedList<String> ll=new LinkedList<String>();
     ll.add("F");
     ll.add("B");
     ll.add("D");
     ll.add("E");
     ll.add("C");
     ll.addLast("Z");
     ll.addFirst("A");
     ll.add(1,"A2");
     System.out.println("Original contents of LL::"+ll);
    ll.remove("F");
    ll.remove(2);
    System.out.println("Contents of LL after deletion::"+ll);
    ll.removeFirst();
    ll.removeLast();
    System.out.println("Contents of after first and last deletion"+ll);
String val=ll.get(2);

ll.set(2,val+"Changed");
System.out.println("LL after change::"+ll);
}
}
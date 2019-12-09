import java.util.*;
class linkedlist
{
static class node
{
   int data;
    node link;
  node(int x)
  {
     data=x;
  }
void display(node p)
{
while(p!=null)
{
  System.out.println(p.data);
  p=p.link;
}
}
}

 public static void main(String args[])
{
   node n1=new node(10);	
 node n2=new node(20);	
  node n3=new node(30);
  node n4=new node(40);

 node n5=new node(40);
 node n6=new node(30);	
 node n7=new node(20);
 node n8=new node(10);

node n9=new node(n1.data+n5.data);

node n10=new node(n2.data+n6.data);
	
 node n11=new node(n3.data+n7.data);

 node n12=new node(n4.data+n8.data);


node root=n1;
n1.link=n2;
n2.link=n3;
n3.link=n4;
n4.link=null;
node p=root;
System.out.println("linkedlist 1");
n1.display(p);


node root1=n5;
n5.link=n6;
n6.link=n7;
n7.link=n8;
n8.link=null;
node p1=root1;
System.out.println("linkedlist 2");
n1.display(p1);

node root2=n9;
n9.link=n10;
n10.link=n11;
n11.link=n12;
n12.link=null;
node p2=root2;
System.out.println("linkedlist sum");
n1.display(p2);
}
}

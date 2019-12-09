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
node root=n1;
n1.link=n2;
n2.link=n3;
n3.link=n4;
n4.link=null;
node p=root;
n1.display(p);
}
}

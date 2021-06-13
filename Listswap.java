class Listswap
{
node head;
 static class node
{
int data;
node next;
  node(int s1)
  {
  data =s1;
  next=null;
  }

}
 public void display()
 {
 node n=head;
 while(n != null)
 {
   System.out.print(n.data+"----->");
   n=n.next;
 }
 }
 public void append(int value)
   {
	   
	   if(head == null)
	   {
		   head=new node(value);
        return;
	   }
	   node new_node=new node(value);
	   new_node.next=null;
	   node last =head;
	   while(last.next !=null)
	   {
		   last=last.next;
	   }
	   last.next=new_node;
	   return;
   }
   int temp;
   public void swap()
   {
   temp=head.data;
   head.data=head.next.data;
   head.next.data=temp;
   }
 public static void main(String args[])
{
Listswap l1=new Listswap();
l1.head=new node(1);

node second=new node(2);
node third=new node(3);


l1.head.next=second;
second.next=third;


l1.append(4);
l1.display();
l1.swap();
l1.display();
}
}
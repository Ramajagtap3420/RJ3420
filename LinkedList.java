import java.util.*;
public class LinkedList
{
	Node head;
	
	class Node
	{
	int data;
	Node next;
		Node(int d)
		{
		data=d;
		next=null;
		}
	}

	public void push(int new_data)
	{
	Node new_node=new Node(new_data);
	new_node.next=head;
	head=new_node;
	}
	
	public void InsertAfter(Node prev,int new_data)
	{
	if(prev==null)
	{
	return;
	}	
	
	Node new_node=new Node(new_data);
	new_node.next=prev.next;
	prev.next=new_node;
	
	}

	public void End(int new_data)
	{
	
	Node new_node=new Node(new_data);
	 if(head==null)
		{
		head=new Node(new_data);
		return;
		}
		new_node.next=null;
		Node last=head;
		last=last.next;
		last.next=new_node;
		return;
	}
	
	public void show()
	
	{
	Node tnode=head;
		while(tnode!=null)
		{
		System.out.print(tnode.data+" ");
		tnode=tnode.next;
		}	
	}

	public static void main(String arg[])
	{
	 LinkedList l=new  LinkedList();
	 l.push(1);
	 l.push(2);
	 l.push(3);
	 l.push(4);
	
	 l.End(11);
	 l.show();	
	}
}

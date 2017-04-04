package org.com;

public class LinkedList {
	Node head = null;

	public void add(String st) {
		Node my = new Node(st);
		if (head == null) {
			Node t = head;
			head = my;
			head.next = t;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = my;
		return;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	boolean compare(String st) {
		Node temp = head;
		while (temp != null) {
			if (((String) temp.data).equalsIgnoreCase(st)) {
			System.out.println("the given word is found");
				return true;
			}
			temp = temp.next;
		}
		System.out.println("the given word is not found");
		return false;
	}
	public void remove(String st)
	{
Node currNode=head;
		
		Node prevNode=null;
		
		if(currNode.data.equalsIgnoreCase(st))
		{
		
			head=head.next;
			
		}
		
		while(currNode != null && !currNode.data.equalsIgnoreCase(st))
		{
			prevNode=currNode;
			currNode=currNode.next;
		} 
prevNode.next = currNode.next;
	}


}

package linkedList;

import java.util.LinkedList;

public class Concatlist {
	
	
	public static void concat(SingleLinkedList l1,SingleLinkedList l2)
	{
		SingleLinkedList res=new SingleLinkedList();
		
		IntNode iter=l1.getHead();
		
		while(iter!=null)
		{
			res.insertFirst(iter.getData());
			iter=iter.getNext();
		}
		
		iter=l2.getHead();
		while(iter!=null)
		{
			res.insertFirst(iter.getData());
			iter=iter.getNext();
		}
		
		res.Display();
		
	}

	public static void main(String[] args) {
		SingleLinkedList l1=new SingleLinkedList();
		SingleLinkedList l2=new SingleLinkedList();
		
		l1.insertFirst(1);
		l1.insertFirst(2);
		
		l1.insertFirst(3);
		l1.insertFirst(4);
		l1.insertFirst(5);
		
		l1.Display();
		
		l2.insertFirst(6);
		l2.insertFirst(7);
		l2.insertFirst(8);
		l2.insertFirst(9);
		l2.insertFirst(10);
		l2.insertFirst(11);
		
		l2.Display();
		
		
		Concatlist.concat(l2, l1);
	
		
	}
}

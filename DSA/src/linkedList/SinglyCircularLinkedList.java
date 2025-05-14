package linkedList;

public class SinglyCircularLinkedList {
	
	private IntNode last;
	
	public SinglyCircularLinkedList()
	{
		last = null;
		
	}

	public IntNode getLast() {
		return last;
	}

	public void setLast(IntNode last) {
		this.last = last;
	}
	
	public void InsertFirst(int d)
	{
		IntNode new_node=new IntNode(d);
		
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return ;
		}
		else
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
		}
		
	}
	
	public void InsertLast(int d)
	{
		IntNode new_node=new IntNode(d);
		
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		else
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			last = new_node;
			return ;
		}
	}
	
	public int DeleteFirst()
	{
		int d=-999;
		if(last==null)
		{
			System.out.println("List is Empty");
			return d;
			
		}
		if(last.getNext()==last)
		{
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
			
		}
		d=last.getNext().getData();
		last.setNext(last.getNext().getNext());
		
		return d;
	}
	
	public void  Insert_by_Pos(int d,int pos)
	{
		IntNode new_node=new IntNode(d);
		
		if(last==null)
		{
			last=new_node;
			last.setNext(new_node);
			return;
		}
		if(pos==1)
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			
			return;
		}
		if(last.getNext()==last)
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			last = new_node;
			return ;
			
		}
		IntNode iter=last.getNext();
		int i;
		for(i=1;i<(pos-1)&&(iter!=last);i++)
		{
			iter=iter.getNext();
		}
		
		if(last==iter)
		{
			new_node.setNext(last.getNext());
			last.setNext(new_node);
			last = new_node;
			return ;
		}
		else {
		
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		
		return;
		}
		
		
	}
	
	public int Delete_by_pos(int pos)
	{
		int d=-999;
		if(last==null)
		{
			System.out.println("List is Empty");
			return d;
		}
		if(last.getNext()==last)
		{
			d = last.getData();
			last.setNext(null);
			last = null;
			return d;
		}
		
		return d;
	}
	
	public int DeleteLast()
	{
		int d=-999;
		if(last==null)
		{
			System.out.println("List is Empty");
			return d;
		}
		if(last.getNext()==last)
		{
			d = last.getData();
			last.setNext(null);
			last = null;
			
			return d;
			
		}
		IntNode iter = last.getNext();
		
		while(iter.getNext() != last)
		{
			iter = iter.getNext();
			
		}
		d=iter.getNext().getData();
		iter.setNext(iter.getNext().getNext());
		last = iter;
		return d;
		
	}
	
	public void Display()
	{
		if(last==null)
		{
			System.out.println("Linked List is Empty...!");
			return;
		}
		
		IntNode iter=last.getNext();
		
		do {
			
			System.out.print(iter.getData()+" ");
			iter=iter.getNext();
			
		}while(iter!=last.getNext());
		
	}
	
	

}

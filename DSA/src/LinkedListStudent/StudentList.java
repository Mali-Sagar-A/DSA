package LinkedListStudent;

public class StudentList {
	
	private Student head;

	public StudentList() {
		head=null;
	}

	public Student getHead() {
		return head;
	}

	public void setHead(Student head) {
		this.head = head;
	}
	
	public void InsertFirst(int rno,String nm,int mks)
	{
		Student new_node=new Student(rno,nm,mks);
		
		if(head==null)
		{
			head=new_node;
			return;
		}
		
		new_node.setNext(head);
		head=new_node;
		return;
		
		
	}
	
	public Student DeleteFirst()
	{
		Student d=new Student();
		if(head==null)
		{
			System.out.println("list is Empty");
			return d;
		}
		else
		{
			d=head;
			head=head.getNext();
			return d;
		}
		
	}
	
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		Student iter=head;
		
		System.out.println("list-> ");
		
		while(iter!=null)
		{
			System.out.println(iter.toString()+" ");
			iter=iter.getNext();
		}
	}
	

}

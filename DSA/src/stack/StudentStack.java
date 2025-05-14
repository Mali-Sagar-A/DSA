package stack;

public class StudentStack {
	private Student arr[];
	private int top;
	
	public StudentStack()
	{
		arr = new Student[10];
		top = -1;
	}
	
	public StudentStack(int s)
	{
		arr = new Student[s];
		top = -1;
	}
	
	public void push(Student d)
	{
		if(top==arr.length-1)
		{
			System.out.println("OverFlow....");
			return;
		}
		else {
		top=top+1;
		arr[top]=d;
		return;
		}
	}
	
	public Student pop()
	{
		Student d=new Student();
		if(top == -1)
		{
			System.out.println("Underflow...");
			return d;
		}else
		{
		d=arr[top];
		top=top-1;
		return d;
		}
		
	}
	public Student peek()
	{
		Student d=new Student();
		if(top==-1)
		{
			System.out.println("underflow..");
			return d;
		}
		return arr[top];
	}
	
	public boolean isFull()
	{
		if(top==arr.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty...");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(arr[i]);
			}
		}
	}
}


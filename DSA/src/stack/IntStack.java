package stack;

public class IntStack {
	private int arr[];
	private int top;
	
	public IntStack()
	{
		arr = new int[10];
		top = -1;
	}
	
	public IntStack(int s)
	{
		arr = new int[s];
		top = -1;
	}
	
	public void push(int d)
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
	
	public int pop()
	{
		int d= -999;
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
	public int peek()
	{
		int d= -999;
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
				System.out.println(arr[i]+" ");
			}
		}
	}
}

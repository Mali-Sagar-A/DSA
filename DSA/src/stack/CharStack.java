package stack;

public class CharStack {
	private char arr[];
	private int top;
	
	public CharStack()
	{
		arr = new char[10];
		top = -1;
	}
	
	public CharStack(int s)
	{
		arr = new char[s];
		top = -1;
	}
	
	public void push(char d)
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
	
	public char pop()
	{
		char d= '#';
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
	public char peek()
	{
		char d= '#';
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


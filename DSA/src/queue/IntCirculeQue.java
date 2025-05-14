package queue;

public class IntCirculeQue {

	private int arr[];
	private int rear,front;
	
	public IntCirculeQue()
	{
		arr=new int[10];
		rear=front=-1;
	}
	
	public IntCirculeQue(int s)
	{
		arr=new int[s];
		rear=front=-1;
		
	}
	
	public boolean isFull()
	{
		if((front==0)&&(rear==arr.length-1)||((front-rear)==1))
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
		if(front==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void insert(int d)
	{
		if(isFull())
		{
			System.out.println("OverFlow..");
		}
		
		if(front==-1)
		{
			front=0;
		}
		
		if(rear==arr.length-1)
		{
			rear=0;
		}
		else
		{
			rear=rear+1;
		}
		arr[rear]=d;
	}
	
	public int remove()
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow");
			return -999;
		}
		int d=arr[front];
		if (front==rear)
		{
			front=rear=-1;
		}
		else if(front==arr.length-1)
		{
			front=0;
		}
		else
		{
			front=front+1;
		}
		return d;
		
	}
}

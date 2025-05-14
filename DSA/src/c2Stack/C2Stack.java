package c2Stack;

public class C2Stack {

	private int arr[];
	private int  topA,topB;
	
	public C2Stack()
	{
		arr=new int[50];
		topA= -1;
		topB=arr.length;		
	}
	
	public boolean isFull()
	{
		if(topB-topA==1){
			return true;
		}else
		{
			return false;
		}
		
	}
	public boolean isEmptyA()
	{
		if(topA==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmptyB()
	{
		if(topB==arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void pushA(int d)
	{
		if(!isFull())
		{
			topA=topA+1;
			arr[topA]=d;
		}
		return;
	}
	public void pushB(int d)
	{
		if(!isFull())
		{
			topB=topB-1;
			arr[topB]=d;
		}
		return;
	}
	public int popA()
	{
		int d=-999;
		if(!isEmptyA())
		{
			
			d=arr[topA];
			topA=topA-1;
		}
		return d;
	}
	public int popB()
	{
		int d=-999;
		if(!isEmptyA())
		{
			d=arr[topB];
			topB=topB+1;
					
		}
		return d;
	}
	
}

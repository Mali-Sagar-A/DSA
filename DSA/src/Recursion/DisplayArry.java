package Recursion;

public class DisplayArry {
	
	public void DisplayBackward(int a[],int i)
	{
		if(i>9)
		{
			return;
		}
		
		DisplayBackward(a,i+1);
		System.out.print(a[i]+" "); 
		return;
		
		
		
	}

	public void DisplayForward(int a[],int i)
	{
		if(i>9)
		{
			return;
		}
		
		
		System.out.print(a[i]+" "); 
		DisplayForward(a,i+1);
		return ;
		
		
	}
	
	public int SumOfArray(int a[],int i)
	{
		if(i>9)
		{
			return 0;
		}
		
		//System.out.print(a[i]+" ");
		
		return a[i]+SumOfArray(a,i+1);
		 
		
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		DisplayArry da=new DisplayArry();
		System.out.print("Display Forward-> ");
		da.DisplayForward(arr, 0);
		System.out.println();
		System.out.print("Display Backward-> ");
		da.DisplayBackward(arr, 0);
		System.out.println();
		
		int sum =da.SumOfArray(arr, 0);
		System.out.print("Sum of Array-> "+sum);
	}
}

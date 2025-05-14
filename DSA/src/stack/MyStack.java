package stack;

import java.util.Scanner;

public class MyStack {
		 //int stack
	  
	public static void main(String[] args) {
		IntStack is = new IntStack();
		Scanner s=new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Menue()");
			System.out.println("1.Push()");
			System.out.println("2.POP()");
			System.out.println("3.Peek()");
			System.out.println("4.isFull()");
			System.out.println("5.isEmpty()");
			System.out.println("6.Display()");


			System.out.println("7.Exit");
			System.out.println("Enter Your Choice(1-7)");
			ch= s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Value To push in stack");
					int v=s.nextInt();
					is.push(v);
					System.out.println("=============***=================***================");
					break;
				}
				case 2:
				{
					System.out.println("=============***=================***================");
					int p = is.pop();
					System.out.println(p);
					System.out.println("=============***=================***================");
					break;
				}
				case 3:
				{
					System.out.println("=============***=================***================");
					int pe = is.peek();
					System.out.println(pe);
					System.out.println("=============***=================***================");
					break;
				}
				case 4:
				{
					System.out.println("=============***=================***================");
					boolean f = is.isFull();
					System.out.println(f);
					System.out.println("=============***=================***================");
					break;
				}
				case 5:
				{
					System.out.println("=============***=================***================");
					boolean e = is.isEmpty();
					System.out.println(e);
					System.out.println("=============***=================***================");
					break;
				}
				case 6:
				{
					System.out.println("=============***=================***================");
					is.display();
					System.out.println("=============***=================***================");
					break;
				}
				default:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Valid Choice Number");
					System.out.println("=============***=================***================");
					break;
				}
			}
		}while(ch!=7);
		
	}
	  /*

	//char Stack
	
	public static void main(String[] args) {
		CharStack is = new CharStack();
		Scanner s=new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Menue()");
			System.out.println("1.Push()");
			System.out.println("2.POP()");
			System.out.println("3.Peek()");
			System.out.println("4.isFull()");
			System.out.println("5.isEmpty()");
			System.out.println("6.Display()");


			System.out.println("7.Exit");
			System.out.println("Enter Your Choice(1-7)");
			ch= s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Value To push in stack");
					char v=s.next().charAt(0);
					is.push(v);
					System.out.println("=============***=================***================");
					break;
				}
				case 2:
				{
					System.out.println("=============***=================***================");
					char p = is.pop();
					System.out.println(p);
					System.out.println("=============***=================***================");
					break;
				}
				case 3:
				{
					System.out.println("=============***=================***================");
					char pe = is.peek();
					System.out.println(pe);
					System.out.println("=============***=================***================");
					break;
				}
				case 4:
				{
					System.out.println("=============***=================***================");
					boolean f = is.isFull();
					System.out.println(f);
					System.out.println("=============***=================***================");
					break;
				}
				case 5:
				{
					System.out.println("=============***=================***================");
					boolean e = is.isEmpty();
					System.out.println(e);
					System.out.println("=============***=================***================");
					break;
				}
				case 6:
				{
					System.out.println("=============***=================***================");
					is.display();
					System.out.println("=============***=================***================");
					break;
				}
				default:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Valid Choice Number");
					System.out.println("=============***=================***================");
					break;
				}
			}
		}while(ch!=7);
		
	}
	
	
	//Student Stack
	
	public static void main(String[] args) {
		StudentStack is = new StudentStack();
		Scanner s=new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Menue()");
			System.out.println("1.Push()");
			System.out.println("2.POP()");
			System.out.println("3.Peek()");
			System.out.println("4.isFull()");
			System.out.println("5.isEmpty()");
			System.out.println("6.Display()");


			System.out.println("7.Exit");
			System.out.println("Enter Your Choice(1-7)");
			ch= s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					
					System.out.println("=============***=================***================");
					System.out.println("Enter Value To push in stack");
					
					System.out.println( "Enter Roll NO:-");
					int id=s.nextInt();
					
					System.out.println("Enter Name :-");
					String nm=s.next();
					
					System.out.println("Enter marks :-");
					float mks=s.nextFloat();
					
			
					
					Student stu=new Student(id,nm,mks);
					
					is.push(stu);
					
					System.out.println("=============***=================***================");
					break;
				}
				case 2:
				{
					System.out.println("=============***=================***================");
					Student p = is.pop();
					System.out.println(p);
					System.out.println("=============***=================***================");
					break;
				}
				case 3:
				{
					System.out.println("=============***=================***================");
					Student pe = is.peek();
					System.out.println(pe);
					System.out.println("=============***=================***================");
					break;
				}
				case 4:
				{
					System.out.println("=============***=================***================");
					boolean f = is.isFull();
					System.out.println(f);
					System.out.println("=============***=================***================");
					break;
				}
				case 5:
				{
					System.out.println("=============***=================***================");
					boolean e = is.isEmpty();
					System.out.println(e);
					System.out.println("=============***=================***================");
					break;
				}
				case 6:
				{
					System.out.println("=============***=================***================");
					is.display();
					System.out.println("=============***=================***================");
					break;
				}
				default:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Valid Choice Number");
					System.out.println("=============***=================***================");
					break;
				}
			}
		}while(ch!=7);
		
	}
	*/

}

package queue;

import java.util.Scanner;

import stack.Student;

public class MyQueue {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		IntQueue IQ=new IntQueue();
		Student stu;
		StudentQueue sq=new StudentQueue();
		int ch;
	
		do {
			
			System.out.println("Student Queue");
			
			System.out.println("1.Insert");
			System.out.println("2.Remove");
			System.out.println("3.Display");
			System.out.println("0.Exit");
			
			
			
			
			System.out.println("enter Your Choice");
			ch=s.nextInt();
			
			
			switch(ch)
			{
				case 1:
				{
					System.err.println("Enter Roll no:-");
					int rno=s.nextInt();
					System.out.println("enyer Name");
					String nm=s.next();
					System.out.println("Enter marks");
					float m=s.nextFloat();
					
					stu=new Student(rno,nm,m);
					
					sq.insert(stu);
					break;
							
					
				}
				case 2:
				{
					stu=sq.remove();
					System.out.println("Student Remove-> "+stu);
					break;
				}
				case 3:
				{
					sq.display();
					break;
				}
				case 0:
				{
					break;
				}
				default:
				{
					System.out.println("Enter Valid Choice ");
				}
			}
			
		}while(ch!=0);
		
		
	}
	

}

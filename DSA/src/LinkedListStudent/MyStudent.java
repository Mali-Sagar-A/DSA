package LinkedListStudent;

import java.util.Scanner;

public class MyStudent {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StudentList sl=new StudentList();
		int ch;
		do {
			System.out.println("student Linked operation");
			System.out.println("1.->Insert Student");
			System.out.println("2.->delete Student");
			System.out.println("3.->Display Student");
			System.out.println("0.->Exit");
			
			
			
			
			System.out.println("Enter your choice");
			ch=s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter Student RollNo");
					int rno=s.nextInt();
					System.out.println("Enter Student Name");
					String nm=s.next();
					System.out.println("Enter Marks");
					int mks=s.nextInt();
					
					
					sl.InsertFirst(rno, nm, mks);
					break;
				}
				case 2:
				{
					sl.DeleteFirst();
					break;
					
				}
				case 3:
				{
					sl.display();
					break;
					
				}
				case 0:
				{
					break;
				}
				default:
				{
					System.out.println("Enter valid Choice");
					break;
				}
			}
			
		}while(ch!=0);
	}

}

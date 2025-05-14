package Hashing;

import java.util.Scanner;

import stack.Student;

public class HashMain {
	
	public static void main(String[] args) {
		
		Student stud;
		
		MyHash mh=new MyHash();
		int ch;
		Scanner s= new Scanner(System.in);
		
		do {
			
			System.out.println("Hashing Operation");
			System.out.println("1.-> InsertRecord");
			System.out.println("11.-> Display");
			System.out.println("0.->Exit");
			
			System.out.println("Enter Your Choice");
			
			ch = s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("Enter Value To push in Hash");
					
					System.out.println("Enter Student RollNo");
					int id=s.nextInt();
					
					System.out.println("Enter Student Name:-> ");
					String nm=s.next();
					
					System.out.println("Enter Student Marks:-> ");
					float mks = s.nextFloat();
					
					stud = new Student(id,nm,mks);
					
					mh.Insert(stud);
					
					break;
				}
				case 0:
				{
					System.out.println("Thank You");
					break;
				}
				default:
				{
					System.out.println("Enter Valid Choice");
					break;
				}
			}
			
		}while(ch!=0);
	}
}

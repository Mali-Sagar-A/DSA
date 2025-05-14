package linkedList;

import java.util.Scanner;

public class MySCLinkedList {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		SinglyCircularLinkedList scll=new SinglyCircularLinkedList();
		int ch;
		do {
			System.out.println("SinglyCircularLinkedList operations");
			System.out.println("1.--> Insert First");
			System.out.println("2.--> Display List");
			System.out.println("3.--> Insert Last");
			System.out.println("4.--> Delete First");
			System.out.println("5.--> Delete Last");
			System.out.println("6.--> Insert By Position");
			
			System.out.println("0.--> Exit");
			System.out.println("Enter Your Choice");

			ch=s.nextInt();
			
			switch(ch)
			{
				
				case 1:
				{
					System.out.println("Enter Data to Add Circular Linked list");
					int d=s.nextInt();
					scll.InsertFirst(d);
					break;
				}
				case 2:
				{
					System.out.println("=============***=================***================");
					scll.Display();
					System.out.println("=============***=================***================");
					break;
				}
				case 3:
				{
					System.out.println("Enter Data to Add Circular Linked list last");
					int d=s.nextInt();
					scll.InsertLast(d);
					break;
				}
				case 4:
				{
					System.out.println("First Deleted");
				
					scll.DeleteFirst();
					break;
				}
				case 5:
				{
					System.out.println("Last Deleted");
				
					scll.DeleteLast();
					break;
				}
				case 6:
				{
					System.out.println("Enter Date You Want To add");
					int d=s.nextInt();
					
					System.out.println("Enter position you Want to add");
					int pos=s.nextInt();
				
					scll.Insert_by_Pos(d, pos);
					break;
				}
				
				case 0:
				{
					System.out.println("=============***=================***================");
					System.out.println("Thank You [Linked List Operation Is Compled]");
					System.out.println("=============***=================***================");
				}
					
				default:
				{
					System.out.println("=============***=================***================");
					System.out.println("Thank You [Linked List Operation Is Compled]");
					System.out.println("=============***=================***================");
					break;
				}
			}
			
		}while(ch !=0);
	}
}

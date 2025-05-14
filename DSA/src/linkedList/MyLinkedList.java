package linkedList;

import java.util.Scanner;

import stack.IntStack;

public class MyLinkedList {

	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		Scanner s=new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("Operation On Singly Linked List");
			System.out.println("1.->Insert First");
			System.out.println("2.->Insert Last");
			System.out.println("3.->Insert_By_Position");
			System.out.println("4.->Delete First()");
			System.out.println("5.->Delete Last");
			System.out.println("6.->Delete By Position");
			System.out.println("7.->Display List");
			System.out.println("8.->Insert Before");
			System.out.println("9.->Insert After");
			System.out.println("10.->Delete Before");
			System.out.println("11.->Delete After");
			System.out.println("12.->Insert Sorted");
			System.out.println("13.->Reverse list");
			System.out.println("14.->Concate List");
			System.out.println("0.->Exit");
			
			System.out.println("Enter Your Choice(1-11)");
			ch= s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("=============***=================***================/n");
					System.out.println("Enter Value To insert in Linked-List");
					int v=s.nextInt();
					
					sll.insertFirst(v);
					
					System.out.println("/n=============***=================***================");
					break;
				}
				case 2:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Value To insert in Linked-List");
					int v=s.nextInt();
					
					sll.insertLast(v);;
					System.out.println("=============***=================***================");
					break;
				}
				case 3:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Value To insert in Linked-List");
					int d=s.nextInt();
					System.out.println("Enter Position To insert in Linked-List");
					int p=s.nextInt();
					sll.Insert_By_Pos(d, p);
					System.out.println("=============***=================***================");
					break;
				}
				case 4:
				{
					System.out.println("=============***=================***================");
					int d=sll.DeleteFirst();
					System.out.println(d+"->Deleted First");
					System.out.println("=============***=================***================");
					break;
				}
				case 5:
				{
					System.out.println("=============***=================***================");
					int d=sll.DeleteLast();
					System.out.println("=============***=================***================");
					break;
				}
				case 6:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Position to Delete node in Linked-List");
					int p=s.nextInt();
					sll.Delete_By_pos(p);
					System.out.println("=============***=================***================");
					break;
				}
				
			
				case 7:
				{
					System.out.println("=============***=================***================");
					System.out.println("");
					sll.Display();
					System.out.println("=============***=================***================");
					break;
				}
				case 8:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Data To insert  node in Linked-List");
					int d=s.nextInt();
					System.out.println("Enter Which key do you want insert before");
					int key=s.nextInt();
					sll.Insert_before(d, key);
					System.out.println("=============***=================***================");
					break;
				}
				case 9:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter Data To insert  node in Linked-List");
					int d=s.nextInt();
					System.out.println("Enter Which key do you want insert after");
					int key=s.nextInt();
					sll.Insert_after(d, key);
					System.out.println("=============***=================***================");
					break;
				}
				
				case 10:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter key to delete before data");
					int key=s.nextInt();
					sll.deleteBefore(key);
					System.out.println("=============***=================***================");
					break;
				}
				case 11:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter key to delete after data");
					int key=s.nextInt();
					sll.Delete_after(key);
					System.out.println("=============***=================***================");
					break;
				}
				case 12:
				{
					System.out.println("=============***=================***================");
					System.out.println("Enter key you want to insert Data");
					int key=s.nextInt();
					sll.inserted_Sorted(key);
					
					System.out.println("=============***=================***================");
					break;
				}
				case 13:
				{
					System.out.println("=============***=================***================");
					System.out.println("Before Reverse:-");
					sll.Display();
					System.out.println("After Reverse:-");
					sll.reverse_list();
					sll.Display();
					
					System.out.println("=============***=================***================");
					break;
				}
				case 14:
				{
					int l2;
					System.out.println("=============***=================***================");
					do {
						System.out.println("Enter Data To Add SinleLinkedList-2");
						int d2=s.nextInt();
						sll2.insertLast(d2);
						
						System.out.println("d2 insterted");
						
						System.out.println("Can you add more data then press (1) if not then (0)");
						l2=s.nextInt();
						
						
						
					}while(l2!=0);
					
					SingleLinkedList Con=sll.concat_list(sll2);
					Con.Display();
					System.out.println("=============***=================***================");
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
		}while(ch!=0);
	}
}

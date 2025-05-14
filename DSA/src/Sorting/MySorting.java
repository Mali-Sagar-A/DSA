package Sorting;

import java.util.Scanner;
import java.util.Vector;

public class MySorting {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		SortingAlgorithm sa= new SortingAlgorithm();
		
		//Vector<Integer> arr=new Vector<Integer>();
		int ch;
		do {
			
			System.out.println("Sorting Algorithm......");
			System.out.println("1.-> Bubble Sort");
			System.out.println("2.-> Selection_Sort ");
			System.out.println("3.-> Insertion_sort ");
			System.out.println("4.-> merge_Version1 ");
			System.out.println("5.-> Merge_version2 ");
			System.out.println("6.-> Merge_Sort_Rec");
			System.out.println("7.-> QuickSort");
			System.out.println("0._> Exit");
			
			
			System.err.println("Enter Your Choice");
			ch = s.nextInt();
			
			switch(ch)
			{
				case 1:
				{
					System.out.println("********************************************");
					int arr[]= {11,5,20,30,32,21,23,40,35,2,3,7,32,25,27};
					sa.bubble_sort(arr);
					System.out.println("bubble_sort");
					sa.Display(arr);
					System.out.println("\n******************************************");
					break;
				}
				case 2:
				{
					System.out.println("********************************************");
					int arr[]= {96,85,64,47,83,43,29,10,43,21};
					sa.Selection_Sort(arr);
					System.out.println("Selection_Sort");
					sa.Display(arr);
					System.out.println("\n******************************************");
					break;
				}
				case 3:
				{
					System.out.println("********************************************");
					int arr[]= {11,5,20,30,32,21,23,40,35,2,3,7,32,25,27};
					sa.Insertion_sort(arr);;
					System.out.println("Insertion_sort");
					sa.Display(arr);
					System.out.println("\n******************************************");
					break;
				}
				case 4:
				{
					System.out.println("********************************************");
					int arr[]= {1,3,5,7,9,11,13,15,17,19};
					int arr2[]= {2,4,6,8,10,12,14,16,18,20};
					
					int []res=new int[arr.length+arr2.length];
					
					sa.merge_Version1(arr, arr2, res);
					System.out.println("merge_Version1");
					sa.Display(res);
					System.out.println("\n******************************************");
					break;
				}
				case 5:
				{
					System.out.println("********************************************");
					int arr[]= {2,4,6,8,10,12,14,16,18,20,1,3,5,7,9,11,13,15,17,19};
					int []res=new int[arr.length];
					sa.Merge_version2(arr, res, 0,9 , 10, 19);
					System.out.println("Merge_version2");
					sa.Display(res);
					System.out.println("\n******************************************");
					break;
				}
				
				case 6:
				{
					System.out.println("********************************************");
					int arr[]= {2,4,6,8,10,12,14,16,18,20,1,3,5,7,9,11,13,15,17,19};
					int []res=new int[arr.length];
					sa.Merge_Sort_Rec(arr, 0, 19);
					System.out.println("Merge_version_Rec");
					sa.Display(arr);
					System.out.println("\n******************************************");
					break;
				}
				case 7:
				{
					System.out.println("********************************************");
					int arr[]= {42,44,19,8,48,80,72,65,82,59,95,6};
					
					sa.QuickSort(arr, 0, arr.length-1);
					System.out.println("QuickSort");
					sa.Display(arr);
					System.out.println("\n******************************************");
					break;
				}
				case 0:
				{
					System.out.println("********************************************");
					
					
					System.out.println("Thank you.......,,");
					
					System.out.println("\n******************************************");
				}
				default:
				{
					System.out.println("Enter Valid Choice");
				}
			}
			
		}while(ch!= 0);
	}

}

package linkListProblems;

import java.util.Scanner;

public class Menu {
   public static void main (String[] args) {
	System.out.println("Enter the Number which operation Want to Complete ..\n Show All list is inbuild");
		
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Green","Jane",60,true);
		Kite k3 = new Kite("Blue","John",80,true);
		Kite k4 = new Kite("Yellow","Julie",90,true);
		Kite k5 = new Kite("Black","Jim",75,true);
		
		MyLinkedList myList = new MyLinkedList();
//		myList.showList();
		
		myList.add(k1);
		myList.add(k2);
		myList.add(k3);
		myList.add(k4);
		myList.add(k5);
		
	   Scanner scan=new Scanner(System.in);
//	   MyLinkedList myList= new SearchByName();
	   int choice=0, r;	  String l,k; 
	   do {
		   System.out.println("Select your choice");
		   System.out.println("*********************");
			System.out.println("1. searchKiteByLength");
			System.out.println("2. searchKiteByName");
			System.out.println("3. deleteNodeByowner");
		   System.out.println("4. Exit");

		   choice=scan.nextInt();	
		   switch(choice) {
		   case 1: {
			   System.out.println("Eneter Length : ");
			   Scanner scan1=new Scanner(System.in);
			   r=scan1.nextInt();
			   myList.searchKiteByLength(r);
			   break;
		       }
		   case 2: {
			   System.out.println("Eneter Name : ");
			   Scanner scan1=new Scanner(System.in);
			   k=scan1.next();
			   myList.searchKiteByName(k);
			   break;
		       }
		   case 3: {
			   System.out.println("Delete Node by Owner : ");
			   Scanner scan1=new Scanner(System.in);
			   l=scan1.next();
			   myList.showList();
			   System.out.println("*********************");
			   myList.deleteNodeByowner(l);
			   System.out.println("*********************");
			   myList.showList();
			   break;
		       }
		   case 4:
			   System.out.println("case 4");

			   break;
		   }
	   }		   while(choice!=4);
	   System.out.println("End of Main");
 
      }
   }
	   
  

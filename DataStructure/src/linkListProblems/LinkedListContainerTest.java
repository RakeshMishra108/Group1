//package linkListProblems;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class LinkedListContainerTest {
//	public static void main(String[] args) {
//		System.out.println("Enter the Number which operation Want to Complete ..\n Show All list is inbuild");
//		
//		Kite k1 = new Kite("Red","Jack",50,true);
//		Kite k2 = new Kite("Green","Jane",60,true);
//		Kite k3 = new Kite("Blue","John",80,true);
//		Kite k4 = new Kite("Yellow","Julie",90,true);
//		Kite k5 = new Kite("Black","Jim",75,true);
//		
//		MyLinkedList myList = new SearchByName();
//		myList.showList();
//		
//		myList.add(k1);
//		myList.add(k2);
//		myList.add(k3);
//		myList.add(k4);
//		myList.add(k5);
//		
//		myList.showList();
//		
//		System.out.println("==================");
//		myList.searchKiteByLength(80);	
//		System.out.println("========================");
//		((SearchByName) myList).searchKiteByName("Jim");	
//		System.out.println("**************");		
//		myList.deleteNodeByowner("Jim");
//		myList.showList();
//	
////		Kite k6 = new Kite("White","Julie",175,true);
//		
////		myList.addAtBegining(k6);
////		System.out.println("==================");
////		myList.showList();
////			
////		LinkedList myList1 = new LinkedList();
//
////		myList.searchKiteByName("Jim");	
//		
////		SearchByName Owner = new SearchByName();
////		myList.searchKiteByLength(80);
//
//		
////		myList1.add(k1);
////		myList1.add(k2);
////		myList1.add(k3);
////		myList1.add(k4);
////		myList1.add(k5);
////
////		Iterator iter = myList1.iterator();
////		while(iter.hasNext()) {
////			Kite k = (Kite) iter.next();
////			System.out.println("k "+k);
////		}
//		
//	}
//}

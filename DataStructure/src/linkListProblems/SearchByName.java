//package linkListProblems;
//
//public class SearchByName extends MyLinkedList{
//	String nametoSearch,int start,int ptr;
//	Kite start,ptr,prev;
//	String searchByName;
//	
//	public void searchKiteByName(String searchByName){
//	boolean found= false;
//	if (start==null) {
//		System.out.println("List is empty ..Name not available");
//	}
//	else {
//		System.out.println("We found some Name ");
//		ptr=start;
//		while(ptr!=null) {
//			if(ptr.owner==searchByName) {
//				System.out.println("name Found : "+ptr);
//				found=true ;
//				break;
//			}
//			ptr=ptr.next;
//		}
//		if(found!=true) {
//			System.out.println("Kite is not found of this name ");
//		}
//	}
//	}
//void searchKiteByLength(int lengthToSearch) {
//		
//		boolean found=false;
//		
//		if(start==null) {
//			System.out.println("List is empty..nothing to search");
//		}
//		else {
//			System.out.println("List is not empty...searching...");
//			ptr = start;
//			while(ptr!=null) {
//				if(ptr.length == lengthToSearch) {
//					System.out.println("Kite Found :"+ptr);
//					found=true;
//					break;
//				}
//				ptr=ptr.next;
//			}
//			if(found!=true) {
//				System.out.println("Kite not found... of this length : "+lengthToSearch);
//			}
//		}
//	}
//}

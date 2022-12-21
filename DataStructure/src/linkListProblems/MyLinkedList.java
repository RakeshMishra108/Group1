 package linkListProblems;

public class MyLinkedList {
Kite start,ptr,prev;
	
	void showList() {
		if(start==null) {
			System.out.println(" List is empty");
		}
		else {
			System.out.println("List is not empty");
			ptr = start;
			while(ptr != null) {
				System.out.println("DATA : "+ptr);
				ptr = ptr.next;				
			}
		}	
	}
	
	 void add(Kite newKite) {
		 if(start ==null) {
			 System.out.println("Adding first node...");
			 start =newKite;
//			 start.next=null;
		 }
		 else {
			 System.out.println("Adding internal node...");
		     ptr=start;
		     while(ptr != null) {
		    	 System.out.println("Serching .....");
		    	 prev = ptr;
		    	 ptr=ptr.next;
		     }
		     prev.next=newKite;
		     newKite.next=null;
		 }
    }
	 
	 void searchKiteByName(String searchByName){
			boolean found= false;
			if (start==null) {
				System.out.println("List is empty ..Name not available");
			}
			else {
				System.out.println("We found some Name ");
				ptr=start;
				while(ptr!=null) {
					if(ptr.owner.equals(searchByName)) {
						System.out.println("name Found : "+ptr);
						found=true ;
						break;
					}
					ptr=ptr.next;
				}
				if(found!=true) {
					System.out.println("Kite is not found of this name ");
				}
			}
			}
	void searchKiteByLength(int lengthToSearch) {
		
		boolean found=false;
		
		if(start==null) {
			System.out.println("List is empty..nothing to search");
		}
		else {
			System.out.println("List is not empty...searching...");
			ptr = start;
			while(ptr!=null) {
				if(ptr.length == lengthToSearch) {
					System.out.println("Kite Found :"+ptr);
					found=true;
					break;
				}
				ptr=ptr.next;
			}
			if(found!=true) {
				System.out.println("Kite not found... of this length : "+lengthToSearch);
			}
		}
	}
	
	void deleteNodeByowner(String ownerName) {
		boolean found=false;
		
		if(start==null) {
			System.out.println("list is empty. Nothing to delete..");
		}
		
		else if(start.owner.equals(ownerName)) {
			prev=start;
			start=start.next;
			prev.next =null;
			System.out.println("Deleted Owner From begining ");
		}
		
		else {
			ptr=start;    //100
			while(ptr!=null) {
				if(ptr.owner.equals(ownerName)) {
					found = true;
					break;
				}
				prev =ptr;    //100
				ptr=ptr.next;
			}
			
		if(found==true) {
			prev.next = ptr.next;
			System.out.println("Internal object deleted ..deleten by Owner Name ");
			ptr.next = null;
			ptr = null;			
		}
		
		else {
			System.out.println("Owner Name is not found ");
		}
		}
	}	
}

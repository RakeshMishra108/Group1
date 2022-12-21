package linkListProblems;

public class AllClasses {
	
	Kite start,ptr,prev;
	
	void insertKite(String ownerToFind , Kite newKite) {
		boolean found =false;
		
		if(start == null) {
			System.out.println("list is empty ..list is added ...");
		}
		else if (start.owner.equals(ownerToFind)) {
			addAtBegining(newKite);
		}
		else {
			ptr= start; //100
			while(ptr !=null) {
				if (ptr.owner.equals(ownerToFind)) {
					found = true;
					break;
				}
				prev = ptr;
				ptr=ptr.next;
			}
	    
	    if(found == true) {
	    	prev.next = newKite;
	    	newKite.next = ptr;
	    	System.out.println("Object incerted before....."+ownerToFind);
	    }
	    else {
	    	System.out.println("object is not found ...."+ownerToFind);
	    }
			
		}
	}

}



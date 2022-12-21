package linkListProblems;

public class DoublyLinkedList {
    MySong start=null,ptr;

	void addSong(MySong newSong){
		if(start == null) {
			System.out.println("Juckbox is empty ...");
			start = newSong;
			start.prev = null;
			start.next = null;
			System.out.println("Added the First Song .....");
		}
		else if (start.next == null) {
			start.next = newSong;
			newSong.prev = start;
			newSong.next = null;
			System.out.println("Added the Second Song...");
		}
		else {
			ptr = start.next;   //200
			
			while(ptr.next !=null) {  //200 != null
				ptr = ptr.next;
			}
			ptr.next = newSong ;
			newSong.prev = ptr;
			newSong.next = null;
			System.out.println("Added the Internal Song...");
		}
	}
	
	void showAllSongs(){
		if(start ==null ) {
			System.out.println("Junk box is empty ...");
		}
		else {
			ptr = start;
			while (ptr != null) {
				System.out.println("Data : "+ptr);
				System.out.println("********************");
			    ptr=ptr.next;
			}
		}		
	}
}





















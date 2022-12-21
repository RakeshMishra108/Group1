package linkListProblems;

public class MainDoublyLinkedListTest {

	public static void main(String[] args) {
		MySong ms1 = new MySong("My Heart Will Go On","Titanic","Celine D",1997);
		MySong ms2 = new MySong("Zhingat","Sairat","Ajay Atul",2016);
		MySong ms3 = new MySong("Tanhayee","Dil Chahta Hai","Sonu Nigam",2001);
		MySong ms4 = new MySong("Tadipar","Tadipar","MC",2020);
		MySong ms5 = new MySong("Just do it","CDAC YCP","MySelf",2022);

		DoublyLinkedList dllList = new DoublyLinkedList();
		dllList.showAllSongs();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		
		dllList.showAllSongs();
	}

}

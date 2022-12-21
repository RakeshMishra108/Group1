package doubleHashing;


// Class 1
public class DoubleHashingTest2 {
	public static void main(String[] args) {
		HashTable2 ht = new HashTable2(7);

		ht.printHashTable2();

		ht.insert("ind1", 50);
		ht.insert("ind2", 700);
		ht.insert("ind3", 76);
		ht.insert("ind4", 85);
		ht.insert("ind5", 92);
		ht.insert("ind6", 73);
		ht.insert("ind7", 103);

		ht.printHashTable2();


	}
}


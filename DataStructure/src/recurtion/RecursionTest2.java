package recurtion;

public class RecursionTest2 {
	
	public static void emptyVasal(int flowerInVasal) {
		 int  flowerInVasal2=1;
	if (flowerInVasal > 0) {
		System.out.println(" --->"+flowerInVasal);
		flowerInVasal2=flowerInVasal2 *(flowerInVasal - 1);
		 System.out.println(flowerInVasal2);
		emptyVasal(flowerInVasal - 1);
        int  flowerInVasal1=flowerInVasal *(flowerInVasal - 1);
		System.out.println("###################");
		System.out.println(" --->"+flowerInVasal);
		System.out.println(flowerInVasal1);
	}
	else {
		System.out.println("Empty");
	}
	}

	public static void main(String[] args) {
      emptyVasal(7);
	}

}

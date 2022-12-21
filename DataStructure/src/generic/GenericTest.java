package generic;

public class GenericTest < GenericType > {
	GenericType x;
	GenericType y;
	
	GenericTest(GenericType x, GenericType y){
		this.x=x;
		this.y=y;
	}
	void print () {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
	void swap() {
		System.out.println("Swapping .....");
		GenericType temp=x; x=y; y=temp;
		System.out.println("Swapped  .....");
	}

}

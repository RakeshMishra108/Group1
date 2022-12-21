package linkListProblems;

public class Kite {
	String colour;
	String owner;
	int length;
	boolean flying;
	Kite next; // refering itself
	
	public Kite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kite(String colour, String owner, int length, boolean flying) {
		super();
		this.colour = colour;
		this.owner = owner;
		this.length = length;
		this.flying = flying;
	}

//	@Override
//	public String toString() {
//		return "Kite [colour=" + colour + ", owner=" + owner + ", length=" + length + ", flying=" + flying + ", next="
//				+ next + "]";
//	}

	@Override
	public String toString() {
		return "Kite [colour=" + colour + ", owner=" + owner + ", length=" + length + ", flying=" + flying + "]";
	}
	
	

}

package queue;

public class MyQueue {
	
	int index=-1; int length ; int array[];
	
	MyQueue(int length ){
		this.length=length;
		array = new int [ length ];
		}
	void add(int item) {
		array[ ++index ] = item ;
		System.out.println("added "+item+" at index "+index);
	}
	int remove () {
		return array [length -1 - index--];
//		throw new ArrayIndexOutOfBoundsExcepstion(" Space is full ");
	}

	public static void main(String[] args) {
		 
		MyQueue que=new MyQueue(5);
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());

	}

}

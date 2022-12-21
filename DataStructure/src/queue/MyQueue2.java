package queue;

public class MyQueue2 {
	public static void main(String[] args) {

		MyQueue2 que= new MyQueue2(5);
		que.add(10);
		que.add(20);
		que.add(305);
		que.add(410);
		que.add(90);
		//		 que.add(60);

		System.out.println(que.remove());  
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());

	}

	int front = -1;
	int index = -1;
	int length;
	int array [];

	MyQueue2(int length){
		this.length = length;
		array = new int [ length ];
	}
	void add(int item) {
		if(index > length-2) {
			throw new RuntimeException("Queue is full...");	
		}
		array [ ++index ] = item;
		System.out.println("added "+item+" at index "+index);
	}
	int remove() {
		if (front > index -1) {
			throw new RuntimeException("Rear reached...");
		}
		return array [ ++front ];
	}
}




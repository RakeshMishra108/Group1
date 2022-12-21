package stackOverflow;

public class StackMain {

	public static void main(String[] args) throws MyStackOverflowException, MyStackEmptyExcpetion {
		MyStack theStack = new MyStack(10);
	
//		for(int i=1;i<100;(i*10)) {
//			theStack.push(i);
//		}
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		
		System.out.println("# element of the top : "+theStack.peek());		
		System.out.println(theStack.pop());
		System.out.println("# element of the top : "+theStack.peek());
		
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
	}

}

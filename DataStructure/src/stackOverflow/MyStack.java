package stackOverflow;

public class MyStack {
  int index=-1;
  int size;
  int array [];

 MyStack(int size){
	  System.out.println("My Stack created with "+size+" intigers");
	  this.size=size;
	  array = new int[size];
//	  Specification
  }
  
  void push(int item) throws MyStackOverflowException{
	  System.out.println("pushing "+item+"to the stack");
	        // 10 20 30 40 50 60
			// -1 0  1  2  3  4 
	  if(index>size-2) {
		  throw new MyStackOverflowException("Stack size is overflown...");   
	  }
	  array [++index]=item;
   }
   int pop() throws MyStackEmptyExcpetion {
	   System.out.println("Popping items from stack....");
	   if(index < 0) {
		   throw new MyStackEmptyExcpetion("Stack is empty...");
	   }
	   return array [ index--] ;
   }
    int peek() {
    	return array [ index ];
    }
}

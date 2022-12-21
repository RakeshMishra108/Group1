package recurtion;

public class RecursionTest {

	public static void main(String[] args) {
		FactorialTest fact=new FactorialTest();
		System.out.println("Factorial : +answer");
		long answer = fact.findFactorialAgain(5);
		System.out.println("Factorial : +answer");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
//		System.out.println("FindFactorial : ");
//		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		long rk=fact.findFactorial(6);
		System.out.println("FindFactorial : "+rk);
		
	}
}
class FactorialTest{
	
	long findFactorial(int num) {
		long factorial = 1;
		
		while(num > 0) {
			System.out.println(num);
			factorial = factorial *num;
			num--;
		}
		return factorial;
	}
	
	long findFactorialAgain(int num) {
		if(num == 0)
			return 1;
		else { 
			long ans = num * findFactorialAgain (num-1);
			System.out.println("Answer : "+ans);
			return ans;
		}
		
	}
}




























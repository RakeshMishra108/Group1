package triksandProblems;

import java.util.Arrays;

public class RotationTest_Main {

	public static void main(String[] args) {
	 int K=35;
		int SA [] = {11,2,3,4};
		
	System.out.println(Arrays.toString(SA));
	int rotatedArray [] =RotationTest.solution(SA, K);
	System.out.println(Arrays.toString(rotatedArray));	

	}

}

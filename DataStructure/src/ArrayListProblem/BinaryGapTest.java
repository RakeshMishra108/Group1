package ArrayListProblem;

import java.util.ArrayList;

//public class Solution extends BinamyGapTest{
public class BinaryGapTest {
    
	public static int solveThis(int N) {
		String binaryRepresentation = Integer.toBinaryString(N);
		System.out.println(N+ " : Binary :"+binaryRepresentation);
		int longestGap = 0;
		ArrayList<Integer> onesList = new ArrayList<Integer>();
		for(int i=0;i<binaryRepresentation.length();i++) {
			if(binaryRepresentation.charAt(i) == '0') 
				continue;
			onesList.add(i);
		}
		// 0 1 2 <--index
		// 0 6 11<--data
		for(int i=0;i<onesList.size()-1;i++) {
			int indicesDifference = onesList.get(i+1) - onesList.get(i) - 1;
			longestGap = Math.max(longestGap, indicesDifference);
		}
		return longestGap;
	}

}


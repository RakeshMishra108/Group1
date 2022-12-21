package triksandProblems;

public class RotationTest {  //Rotation test 
	public static int[] solution(int sourceArray[], int k) {
	int targetArray [] =new int [ sourceArray.length];
//	int[] sourceArray[]= {3,8,9,7,6};
//    int[] targetArray(sourceArray.length);	
    
    for(int i=0;i<sourceArray.length;i++) {
    	int rotatedIndex= (i+k) % sourceArray.length;
    	targetArray [rotatedIndex]= sourceArray[i];
    }
	return targetArray;
  }
}


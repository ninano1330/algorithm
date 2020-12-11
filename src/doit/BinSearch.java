package doit;

import java.util.Arrays;

public class BinSearch {

	public static void main(String[] args) {
		int[] numArr = {1,4,7,10,59,300,3818,10598,184767,1030405};
		
		int n = 582958;
		
		
		System.out.println(Arrays.binarySearch(numArr, n));
		System.out.println(binSearch(numArr, n));
	}
		
	static int binSearch(int[] numArr, int n) {
		int startIdx = 0;
		int endIdx = numArr.length -1;
		
		while(endIdx>=startIdx) {
			int midIdx = (startIdx+endIdx)/2;
			
			if(numArr[midIdx] == n) {
				return midIdx;
			}else if(numArr[midIdx] > n) {
				endIdx = midIdx -1;
			}else if(numArr[midIdx] < n) {
				startIdx = midIdx +1;
			}
		}
		
		return -1;
	}

}

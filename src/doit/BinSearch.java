package doit;

public class BinSearch {

	public static void main(String[] args) {
		int[] numArr = {1,4,7,10,59,300,3818,10598,184767,1030405};
		
		int n = 582958;
		
		System.out.println(binSearch(numArr, n));
	}
	
//	static int binSearch(int[] a, int n, int key) {
//		int pl = 0; //검색 범위의 첫 인덱스
//		int pr = n-1; //검색 범위의 끝 인덱스
//		
//		do {
//			int pc = (pl + pr) / 2;
//			if(a[pc] == key) return pc;
//			else if(a[pc] < key) pl = pc +1;
//			else pr = pc -1;            //검색 범위를 앞쪽 절반으로 좁힘
//		}while(pl <= pr);
//		
//		return -1;
//	}
	
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

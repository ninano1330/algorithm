package review;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 33;
		System.out.println(getSqureRoot(n));	//-1
		
		n = 144;
		System.out.println(getSqureRoot(n));	//122
	}

	//이진 탐색을 활용
	public static int getSqureRoot(int n) {
		int min = 1;
		int max = n;
		
		while(min <= max) {
			int mid = (max + min) / 2;
			if(mid * mid == n) {
				return mid;
				
			}else if(mid * mid > n) {
				max = mid -1;
				
			}else if(mid * mid < n) {
				min = mid +1;
			}
		}
		
		return -1;		//양수 제곱근이 없음
	}
}

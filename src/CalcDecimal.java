
public class CalcDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
//		int n = 5;

		System.out.println(solution(n));

	}

	public static int solution(int n) {
		int count = 0;
		int[] a= new int[n-1];
		
		for(int i=2; i <=n; i++) {
			a[i-2] = i;
		}
		
		
		for(int i =2; i*i <= n; i++) {
			
		}
		
		return count;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count = 0;
//		if(n >=3) {
//			count +=2;
//		}else {
//			return 1;
//		}
//
//		for (int i = 4; i <= n; i++) {
//			int div = 0;
//			int half = i/2;
//			for (int j =2; j <= half; j++) {
//				if(i %j ==0) div ++;
//				if(div >0) { 
//					System.out.println(i + " is not 소수");
//					break;
//				}
//				if(j == half) {
//					System.out.println(i + " is 소수");
//					count ++;
//					break;
//				}
//			}
//
//		}
//
//		return count;
	}
}

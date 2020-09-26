package solved;

public class CharToInt2 {

	public static void main(String[] args) {
//		int arr = 10;
//		int arr = 12;
//		int arr = 11;
		int arr = 13;
		System.out.println(solution(arr));
	}

	public static boolean solution(int x) {
		String s = String.valueOf(x);
		int sum = 0;
		
		for(int i=0; i < s.length(); i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}

		return x%sum ==0;
	}

}

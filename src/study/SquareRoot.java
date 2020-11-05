package study;

public class SquareRoot {

	public static void main(String[] args) {
		int n = 46225;
	
		System.out.println(solution(n));
	}
	
	public static int solution(int n) {
		int min = 1;
		int max = n;
		int guess = 0;

		while(min <= max) {
			guess = (min+ max) /2;
			
			if(guess * guess ==n) {
				return guess;
			}else if(guess * guess >n) {
				max = guess -1;
			}else {
				min = guess +1;
			}
		}
		return -1;
	}

}

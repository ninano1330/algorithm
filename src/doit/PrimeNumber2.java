package doit;

public class PrimeNumber2 {
	//1000이하 소수 열거
	public static void main(String[] args) {
		int counter = 0; //나눗셈의 횟수
		int ptr = 0;	//찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수. 배열에 저장.
		
		for(int n =3; n <=1000; n+=2) { //대상은 홀수만. 짝수는 소수가 아니다.
			int i;
			for(i=1; i<ptr; i++) {  //이미 잧은 소수로 나누어 봄
				counter
				++;
				if( n % prime[i] ==0)
					break;
			}
			
			if(ptr ==i) {
				prime[ptr++] = n; //위 for문이 전부 수행됐으므로 소수임. 배열에 저장.
			}
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈 : " + counter);
		

	}

}

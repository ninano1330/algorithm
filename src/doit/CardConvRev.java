package doit;

import java.util.ArrayList;

public class CardConvRev {
	static ArrayList<Integer> al;
	
	public static void main(String args[]) {
		
		
		
		
		
		int n = 10;
		al = new ArrayList<Integer>();
		//num2(10);
		num22(2);
		
		for(int i=al.size()-1; i>=0; i--) {
			System.out.print(al.get(i));
		}
		System.out.println();
	}
	
	//정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
	static int cardConvR(int x, int r, char[] d) {
		int digits = 0; //변환 후 자릿수
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r); //r로 나눈 나머지를 저장
			x /= r;
		}while(x != 0);
		
		return digits;
	}
	
	static ArrayList num2(int n) {
		if(n==0) {			
			return al;
		}
		
		al.add(n%2);
		return num2(n/2);
	}
	
	static ArrayList num22(int n) {
		do {
			al.add(n % 2);
			n = n/2;
		}while(n !=0);
		
		return al;
	}
	
	
}

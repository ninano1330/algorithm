package doit;

import java.util.Scanner;
import java.util.Stack;

public class Recur {

	static void recur(int n) {
		// 재귀 함수
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	static void recur2(int n) {
		while(n>0) {
			recur(n-1);
			System.out.println(n);
			n = n-2; //꼬리 재귀 제거
		}
	}
	
	//꼬리 재귀를 제거했습니다.
	static void recur3(int n) {
		//IntStack s = new intStack(n);
		Stack<Integer> s = new Stack();
		
		while(true) {
			if(n>0) {
				s.add(n);
				n = n-1;
				continue;
			}
			
			if(!s.isEmpty()) {
				n = s.pop();
				System.out.println(n);
				n= n-2;
				continue; 
			}
			
			break;
		}
		
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();

		recur3(x);
	}

}

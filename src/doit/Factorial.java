package doit;

import java.util.Scanner;

/* 
 * 팩토리얼 구하기 (재귀 호출)
 * 직접 재귀 : 자신과 같은 메서드를 호출하면 직접(direct) 재귀
 * 1. 0! = 1
 * 2. n>0 이면 n! = n(n-1)! 
 */
public class Factorial {
	static int factorial(int n) {
		if(n>0) {
			return n * factorial(n-1);
		}else
			return 1;
	}
	
	static int factorial2(int n) {
		if(n==0) return 1;
		else {
			int result = 1;
			while(n>0) {
				result *= n;
				n-= 1;
			}
			return result;
		}	
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요. : ");
		int x = stdIn.nextInt();
		
		System.out.println(x + " 의 팩토리얼은 " + factorial2(x) + " 입니다.");
	}
}

package review;

import java.util.HashSet;
import java.util.Set;

//순열 알고리즘 
//pg 완전탐색 > 소수찾기
public class Permutation {
	public static int solution(String numbers) {
		char[] numArr = numbers.toCharArray();
		result = 0;
		numbersList = new HashSet<>();
		
		for(int i=1; i<=numArr.length; i++) {
			permutation(numArr, 0, numArr.length, i);
		}
		
		for(int n : numbersList) {
			System.out.println(n);
			if(isPrime(n)) result++;
		}
		
        return result;
    }
	
	static int result;
	static Set<Integer> numbersList;

	// 순서 없이 n 개중에서 r 개를 뽑는 경우
	// 사용 예시: permutation(arr, 0, n, 4);
	static void permutation(char[] arr, int depth, int n, int r) {
		if (depth == r) {
			print(arr, r);
			return;
		}

		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}

	static void swap(char[] arr, int depth, int i) {
		char temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
	
	//r개
	static void print(char[] arr, int r) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<r; i++) {
			//System.out.print(arr[i]);
			sb.append(arr[i]);
		}
		//System.out.println(Integer.parseInt(sb.toString()));
		
		numbersList.add(Integer.parseInt(sb.toString()));
		//System.out.println();
	}
	
	static boolean isPrime(int n) {
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2; i<= (int)Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(Integer.parseInt("013"));

		//int[] arr = { 1, 2, 3 };
		//permutation(arr, 0, 3, 3);
		
		String numbers = "17";
		System.out.println("result : " + solution(numbers));
		
		numbers = "011";
		System.out.println("result : " + solution(numbers));
		
		//System.out.println((int)Math.sqrt(2));
	}

}

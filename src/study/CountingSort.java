package study;

import java.util.Arrays;
import java.util.Collections;

public class CountingSort {
	public static void main(String[] args) {
		Integer a[] = {1,0,3,1,3,1};
		int max = Collections.max(Arrays.asList(a));
		
		Integer[] aux = new Integer[a.length];
		Integer[] c = new Integer[max+1];
		Arrays.fill(c, 0);
		
		// 각 원소 갯수 계산
		// c[] = {1,3,0,2}
		for(int i=0; i<a.length; i++) {
			c[a[i]]++;
		}
		
		// 누적합 계산
		// c[] = {1,4,4,6}
		// 0은 0~1번째 사이에 위치 0
		// 1은 1~4번째 사이에 위치 1,2,3
		// 2는 4번째에서 4번째 사이에 0(x)
		// 3은 4번째에서 6번째 사이에 4,5
		for(int i=0; i<c.length; i++) {
			c[i] += c[i-1];
		}
		
		// 누적합을 이용해 정렬
		
	}
}

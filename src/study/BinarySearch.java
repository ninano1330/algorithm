package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[count];
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		while(st.hasMoreTokens()) {
			arr[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
		Arrays.sort(arr);
		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		count = Integer.parseInt(br.readLine());
		Integer[] num2 = new Integer[count];
		int[] result = new int[count];

		st = new StringTokenizer(br.readLine());
		idx = 0;
		while(st.hasMoreTokens()) {
			num2[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		
//		Arrays.sort(num2);
//		for(int i=0; i<num2.length; i++) {
//			System.out.println(num2[i]);
//		}
		
		idx = 0;

		
		for(int i=0; i<result.length; i++) {
			result[i] = solution(arr,num2[i]);
			System.out.println(result[i]);
		}
	}
	
	public static int solution(Integer[] arr, int num) {
		int high = arr.length-1;
		int low = 0;
		int mid = 0;
		
		while(low<=high) {
			mid = (high + low) / 2;
			
			if(arr[mid] == num) {
				return 1;
			}else if(arr[mid] > num) {
				high = mid -1;
			}else {
				low = mid +1;
			}
		}
		return 0;
	}
}

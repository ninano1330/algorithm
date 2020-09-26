package notsolved;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2 };
//		int[] arr = { 5, 9, 4, 3, 1, 2 };
//		int[] arr = { 4, 3, 2, 1 };
//		int[] arr = { 10 };
		solution(arr);
	}

	public static int[] solution(int[] arr) {
		if(arr.length ==1) {
			int[] an_arr = new int[1];
			an_arr[0] = -1;
			return an_arr;
		}
		
		int min = 0;
		for(int i=0; i< arr.length-1; i++) {
			min = arr[i] <= arr[i+1] ? arr[i] : arr[i+1];
		}
		
		System.out.println("min : " + min);
		
		int re_arr[] = new int[arr.length-1];
		
		System.out.println("arr.length : " + arr.length);
		System.out.println("re_arr.length : " + re_arr.length);
		
		int r_idx =0;
		for(int idx=0; idx<arr.length; idx++) {
			if(arr[idx] == min) {
				continue;
			}
			
			re_arr[r_idx] = arr[idx];
			System.out.println("re_arr[" + r_idx + "] : " + re_arr[r_idx]);
			r_idx ++;
		}
		
		return re_arr;
	}

}

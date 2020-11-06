package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BinarySearch2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int[] card = new int[count];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int idx = 0;
		while(st.hasMoreTokens()) {
			card[idx] = Integer.parseInt(st.nextToken());
			idx++;
		}
		Arrays.sort(card);
		
		count = Integer.parseInt(br.readLine());
		//int[] num = new int[count];
		
		st = new StringTokenizer(br.readLine());
		//idx = 0;
		
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			//num[idx] = Integer.parseInt(st.nextToken()); 
			int num = Integer.parseInt(st.nextToken()); 
			
			sb.append(binarySearch(card, num));
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	public static int binarySearch(int[] card, int num) {
		int high = card.length-1;
		int low = 0;
		
		while(low<=high) {
			int mid = (high + low) /2;
			
			if(card[mid] == num) {
				return 1;
			}else if(card[mid] > num) {
				high = mid -1;
			}else {
				low = mid + 1;
			}
		}
		
		return 0;
	}

}

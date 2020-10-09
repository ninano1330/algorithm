package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baek_1475 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = br.readLine();
		int[] num = new int[10];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			num[c-48]++;
		}
		
		
		num[6] = (num[6] + num[9])/2 + (num[6] + num[9])%2;
		num[9] = 0;
		Arrays.sort(num);
		
		System.out.println(num[9]);
		
//		System.out.println((int)'0');
//		System.out.println((int)'9');
	}

}

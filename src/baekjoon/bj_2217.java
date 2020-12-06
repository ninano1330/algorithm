package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class bj_2217 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int inputCnt = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> rope = new ArrayList<Integer>();
		while(inputCnt>0) {
			rope.add(Integer.parseInt(br.readLine()));
			inputCnt--;
		}
		
		rope.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		int max = 0;
		for(int i=0; i<rope.size(); i++) {
			int sum = rope.get(i) * (i+1);
			
			if(sum>=max) {
				max = sum;
			}else {
				break;
			}
		}
		
		System.out.println(max);
		
	}

}

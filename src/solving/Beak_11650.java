package solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Beak_11650 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<int[][]> al = new ArrayList<int[][]>();
		
		while(count>0) {
			st = new StringTokenizer(br.readLine());
			//int num1 = Integer.parseInt(st.nextToken());
			//int num2 = Integer.parseInt(st.nextToken());
			
			int[][] numArr = {{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())}};
			
			al.add(numArr);
			
			count--;
		}
		
		Collections.sort(al, new Comparator<int[][]>() {

			@Override
			public int compare(int[][] o1, int[][] o2) {
				if(o1[0][0] == o2[0][0]) {
					return o1[0][1] - o2[0][1];
				}else {
					return o1[0][0] - o2[0][0];
				}
			}
		});
		
		
		for(int i=0; i<al.size(); i++) {
			int[][] result = al.get(i);
//			System.out.println(result[0][0] +  " " + result[0][1]);
			bw.write((result[0][0] +  " " + result[0][1] + "\n"));
		}
		
		bw.flush();
	}
}

package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_1946 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int testCase = Integer.parseInt(br.readLine());
		
		while(testCase>0) {
			int apl = Integer.parseInt(br.readLine());
			
			ArrayList<int[]> al = new ArrayList<int[]>();
			while(apl>0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				int[] tmp = new int[2];
				tmp[0] = Integer.parseInt(st.nextToken());
				tmp[1] = Integer.parseInt(st.nextToken());

				al.add(tmp);
				
				apl--;
			}
			
			al.sort(new Comparator<int[]>() {

				@Override
				public int compare(int[] o1, int[] o2) {
					return o1[0] - o2[0];
				}
			});
			
			int[] first = al.get(0);
			int count = 1;
			for(int i=1; i<al.size(); i++) {
				int[] tmp = al.get(i);
				
				if((first[0]>tmp[0] && first[1]<tmp[1]) 
						||(first[0]<tmp[0] && first[1]>tmp[1])) {
					count++;
					first = al.get(i);
				}
			}
		
			System.out.println(count);
		
			testCase--;
		}
	}

}

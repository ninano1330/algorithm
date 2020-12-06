package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_11399 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pepCnt = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			al.add(Integer.parseInt(st.nextToken()));
		}
		
		al.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 -o2;
			}
		});
		
//		int timeSum = al.get(0);
//		int timeResult = al.get(0);
		int timeSum = 0;
		int timeResult = 0;
		for(int i=0; i<al.size(); i++) {
			//System.out.println("timeSum : " + timeSum);
			timeResult += timeSum + al.get(i);
			timeSum += al.get(i);
			//System.out.println("timeResult : " + timeResult);
		}
		
		System.out.println(timeResult);
	}
}

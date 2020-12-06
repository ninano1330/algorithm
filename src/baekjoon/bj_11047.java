package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class bj_11047 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		int money = Integer.parseInt(st.nextToken());
		
		List<Integer> al = new ArrayList<>();
		for(int i=0; i<cnt; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		
		int result = 0;
		for(int i=al.size()-1; i>=0; i--) {
			//System.out.println("money : " + money);
			//System.out.println("coin : " + al.get(i));
			result += money / al.get(i);
			
			if(money % al.get(i) ==0) {
				break;
			}else {
				money = money % al.get(i);
			}
			
			//System.out.println();
		}
		
		System.out.println(result);
	}

}

package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SetBasic {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int result = 0;
		
		Set<String> set = new HashSet<String>();
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			set.add(str);
		}
		
		for(int i=1; i<=M; i++) {
			String str = br.readLine();
			if(set.contains(str)) {
				result++;
				continue;
			}
		}
		
		System.out.println(result);
	}
}

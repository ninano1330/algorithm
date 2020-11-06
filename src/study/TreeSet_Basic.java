package study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class TreeSet_Basic {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(br.readLine());
		
		Set<Integer> set = new TreeSet<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		
		Iterator<Integer> it = set.iterator();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(it.hasNext()) {
			bw.write(it.next() + " ");
			//System.out.println(it.next());
		}
		
		bw.flush();
		bw.close();
	}

}

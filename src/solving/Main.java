package solving;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(count >0) {
			int num = Integer.parseInt(br.readLine());
			al.add(num);
			count--;
		}
		
		Collections.sort(al);
		
		for(int i=0; i< al.size(); i++) {
			bw.write(al.get(i) + "\n");
		}
		
		bw.flush();
		
	}

}

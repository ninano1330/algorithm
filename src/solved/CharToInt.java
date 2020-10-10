package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CharToInt {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0 ; i<str.length(); i++) {
			al.add(str.charAt(i) - '0');
		}
		
		Collections.sort(al,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		for(int i=0 ; i<al.size(); i++) {
//			bw.write(al.get(i));
			System.out.print(al.get(i));
		}
	
//		bw.flush();
	}

}

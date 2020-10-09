package review;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortSpeed {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
//		int[] numArr = new int[count];
		ArrayList<Integer> al = new ArrayList<Integer>();
			
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = Integer.parseInt(br.readLine());
//		}
		for(int i=0; i<count; i++) {
			al.add(Integer.parseInt(br.readLine()));
		}
		
//		Arrays.sort(numArr);
		Collections.sort(al);
		
//		for(int i =0; i<numArr.length; i++) {
//			bw.write(numArr[i] + "\n");
//		}
		for(int i =0; i<al.size(); i++) {
			bw.write(al.get(i) + "\n");
		}
		
		bw.flush();
	}

}

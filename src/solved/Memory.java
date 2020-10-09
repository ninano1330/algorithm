package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

public class Memory {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = Integer.parseInt(br.readLine());
//		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] numArr = new int[count];
		
//		while(count >0) {
//			al.add(Integer.parseInt(br.readLine()));
//			count--;
//		}
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
//		Collections.sort(al);
		Arrays.sort(numArr);
		

//		for(int i=0; i<al.size(); i++) {
////			System.out.println(al.get(i));
//			bw.write(al.get(i) + "\n");
//		}
		for(int i=0; i<numArr.length; i++) {
//			System.out.println(al.get(i));
			bw.write(numArr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}

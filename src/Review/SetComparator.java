package review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class SetComparator {
	public static void main(String[] args) throws IOException {
//		Scanner scanner = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());

		int count = Integer.parseInt(br.readLine());
	//	String[] strArr = new String[13];

		
		Set<String> strSet = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} else {
					for(int i=0; i < o1.length(); i++) {
						if(o1.charAt(i) != o2.charAt(i)) {
							return o1.charAt(i) - o2.charAt(i);
						}
					}
				}
				return 0;
			}
		});

		
//		for(int i=0; i<count; i++) {
//			strArr[i] = br.readLine();
//		}
		for (int i = 0; i < count; i++) {
			strSet.add(br.readLine());
		}
		
		Iterator<String> it = strSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}

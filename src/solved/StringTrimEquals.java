package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTrimEquals {
	public static void main(String[] args) throws IOException {
		// Scanner scanner = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// StringTokenizer st = new StringTokenizer(br.readLine());

		String str = br.readLine();

		if (str.equals(" ")) {
			System.out.println(0);
		} else {
			

			String[] strArr = str.trim().split(" ");

			System.out.println(strArr.length);
		}
//		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
	}

}

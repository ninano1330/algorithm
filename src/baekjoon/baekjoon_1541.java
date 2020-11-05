package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class baekjoon_1541 {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		String formula = br.readLine();
		
		String[] formulaArr = formula.split("-");
		//System.out.println(formulaArr[0]);
		String[] numArr = formulaArr[0].split("\\+");
		

		int sum=0;
		for(int i=0; i<numArr.length; i++) {
			sum += Integer.parseInt(numArr[i]);
		}
		
		//System.out.println("sum 초기값 : " + sum);
		
		for(int i=1; i<formulaArr.length; i++) {
			numArr = formulaArr[i].split("\\+");
			int minus = 0;
			
			for(int j=0; j<numArr.length; j++) {
				minus += Integer.parseInt(numArr[j]);
			}
			
			sum -= minus;
		}
		
		System.out.println(sum);
	}
}

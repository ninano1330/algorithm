package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ObjectSort {
	public static void main(String[] args) throws IOException {
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int count = Integer.parseInt(br.readLine());
		ArrayList<member> al = new ArrayList<member>();
		
		while(count>0) {
			st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			al.add(new member().setAge(age).setName(name));
			
			count--;
		}
		
		Collections.sort(al,new Comparator<member>() {

			@Override
			public int compare(member o1, member o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).getAge() + " " + al.get(i).getName());
		}
		
	}
	
	public static class member{
		int age = 0;
		String name = "";
		
		public int getAge() {
			return age;
		}
		public member setAge(int age) {
			this.age = age;
			return this;
		}
		public String getName() {
			return name;
		}
		public member setName(String name) {
			this.name = name;
			return this;
		}
	}

}

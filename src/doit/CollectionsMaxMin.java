package doit;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMaxMin {

	public static void main(String[] args) {
		int a = 10; int b = 30; int c = 20;
		System.out.println(min3(a,b,c));
		System.out.println(max3(a,b,c));
	}

	public static int min3(int a, int b, int c) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		
		return Collections.min(al);
	}
	
	public static int max3(int a, int b, int c) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(a);
		al.add(b);
		al.add(c);
		
		return Collections.max(al);
	}
}

package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		Collections.reverseOrder();
		
		
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return a-b;
			}
		});
	}

}

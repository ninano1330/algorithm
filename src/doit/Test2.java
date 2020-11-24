package doit;

public class Test2 {
	public static void main(String[] args) {
		int[] a = {4,591,5,185,32,7,6,199};
		int n = 99;
		int idx = -1;
		
		for(int i=0; i<a.length;i++) {
			if(a[i] ==n ) {
				idx = i;
			}
		}
		
		System.out.println(idx);
	}
}

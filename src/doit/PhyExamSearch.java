package doit;

import java.util.Arrays;
import java.util.Comparator;

public class PhyExamSearch {
	//신체검사 데이터를 정의
	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new Comparator<PhyscData>() {
			@Override
			public int compare(PhyscData o1, PhyscData o2) {
				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0; 
			}
		};
		
//		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
//		private static class HeightOrderComparator implements Comparator<PhyscData>{
//
//			@Override
//			public int compare(PhyscData o1, PhyscData o2) {
//				return (o1.height > o2.height) ? 1 : (o1.height < o2.height) ? -1 : 0;
//			}
//			
//		}
	}
	
	
	
	public static void main(String[] args) {
		PhyscData[] x = {
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("전민규", 170, 0.5),
				new PhyscData("최재영", 164, 1.2),
				new PhyscData("최지윤", 173, 0.1),
				new PhyscData("호연", 165, 2.0),
				new PhyscData("태훈", 165, 0.4),
				new PhyscData("매", 200, 5.0),
				new PhyscData("몽고반점", 155, 10.0),
				new PhyscData("이나영", 167, 1.5),
				new PhyscData("원빈", 179, 0.35),
		};
		
		int idx = Arrays.binarySearch(x, new PhyscData("",165,0.0), PhyscData.HEIGHT_ORDER);
		
		System.out.println(idx);
		System.out.println(x[idx]);
	}

}

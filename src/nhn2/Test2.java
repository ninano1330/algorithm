package nhn2;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
//		int page = 5457;
//		int[] broken = {6,7,8};
		
//		int page = 100;
//		int[] broken = {1,0,5};
//		
//		int page = 99999;
//		int[] broken = {0,2,3,4,5,6,7,8,9};

//		int page = 158;
//		int[] broken = {1,9,2,5,4};
		
		int page = 151241;
		int[] broken = {0,1,2,3,4,7,8,9};
		
		solution(page,broken);
	}
	
	 public static int solution(int page, int[] broken){
		 String pageStr = String.valueOf(page);
		 int[] pages = new int[pageStr.length()];
		 
		 for(int i=0; i<pageStr.length(); i++) {
			 pages[i] = (int) (pageStr.charAt(i) - '0');
		 }
		 
		 Arrays.sort(broken);
		 	
		 int[] newPages = new int[pageStr.length()+1];
		 int[] insteadPages = new int[11-broken.length];
		 int idx = 0;
		 for(int j=0; j<10; j++) {
			 if(Arrays.binarySearch(broken, j) < 0) {
				 //System.out.println("j : " + j);
				 insteadPages[idx] = j;
				 idx++;
			 }
		 }
		
//		 
//		 for(int i=0; i<insteadPages.length; i++) {
//			 System.out.println(insteadPages[i]);
//		 }
		 
		 int pressCnt = 0;
		 for(int i=0; i<pages.length; i++) {
			 int nowPage = pages[i];
			 int chkBroken = Arrays.binarySearch(broken, nowPage);
			 
			 if(chkBroken<0) {
				 newPages[i] = nowPage;
				 pressCnt++;
			 }else {
				 int abs = 9;
				 int resultIdx = 0;
				 for(int j=0; j<insteadPages.length; j++) {
//					 System.out.println(Math.abs(nowPage - insteadPages[j]));
					 int calcAbs = Math.abs(nowPage - insteadPages[j]);
					 if(calcAbs < abs) {
						 resultIdx = j;
						 abs = calcAbs;
					 }else {
//						 System.out.println("result : " + insteadPages[resultIdx]);
//						 System.out.println("abs : " + abs);
						 newPages[i] = insteadPages[resultIdx];
						 pressCnt++;
						 break;
						 
					 }
				 }
			 }
		 }
		 
		 newPages[newPages.length-1] = insteadPages[0];
		 
		
//		 for(int i=0; i<newPages.length; i++) {
//			 System.out.print(newPages[i]);
//		 }
		 
		 int defaultPage = 100;
		 String tmp = "";
		 for(int i=0; i<newPages.length-1; i++) {
			 tmp += newPages[i];
		 }
		 
		 
		 int newPage = Integer.parseInt(tmp);
		 tmp += newPages[newPages.length-1];
		 int minpage = Integer.parseInt(tmp);
		 
		 tmp = "";
		 for(int i=0; i<newPages.length-2; i++) {
			 tmp += insteadPages[insteadPages.length-2];
		 }
		 
		 int maxpage = Integer.parseInt(tmp);
		 
		 int defaultPageResult = Math.abs(page - defaultPage);
		 int newPageResult = Math.abs(page - newPage);
		 int newPage2Result = Math.abs(page - minpage);
		 int newPage3Result = Math.abs(page - maxpage);
		 
//		 System.out.println(defaultPageResult);
//		 System.out.println(newPageResult);
//		 System.out.println(newPage2Result);
//		 System.out.println(pressCnt);
		 
		 
		 System.out.println(defaultPageResult);
		 System.out.println((pressCnt + newPageResult) );
		 System.out.println((pressCnt + newPage2Result +1));
		 System.out.println((pressCnt + newPage3Result -1));
		 
		 int minPress = Math.min(defaultPageResult, newPageResult);
		 minPress = Math.min(minPress, newPage2Result);
		 minPress = Math.min(minPress, newPage3Result);
		 System.out.println(minPress);
		 
		 
		 
		 
		 if(minPress == newPage2Result) {
			 System.out.println("result : " + (pressCnt + minPress +1));
			 return pressCnt + minPress +1;
		 }else if(minPress == defaultPageResult){
			 System.out.println("result : " + (defaultPageResult));
			 return defaultPageResult;
		 }else if(minPress == newPage3Result){
			 System.out.println("result : " + (pressCnt + minPress -1));
			 return pressCnt + minPress;
		 }else {
			 System.out.println("result : " + (pressCnt + minPress));
		 }
		 
		 return -1;
	 }
}

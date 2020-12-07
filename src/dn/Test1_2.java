package dn;

public class Test1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "abcaefg", "abcdefg", "abcdhfg" };
//		 String[] strs = {"a", "b", "c"};
		
		System.out.println(solution(strs));

		// System.out.println("abcdef".indexOf("ab"));
	}

	public static String solution(String[] strs) {
		//String firstStr = strs[0];
		StringBuilder firstStr = new StringBuilder(strs[0]);
		for (int i = firstStr.length(); i > 0; i--) {
			//String str = firstStr.substring(0, i);
			String str = firstStr.substring(0, i);
			System.out.println(str);
			boolean chkStr = true;
			for(int j=1; j < strs.length; j++) {
				if(strs[j].indexOf(str) !=0) {
					chkStr = false;
					break;
				}
			}
			
			if(chkStr) {
				return str;
			}
		}
		
		return "";
	}

}

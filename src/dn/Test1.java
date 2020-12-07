package dn;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs = {"abcaefg", "abcdefg", "abcdhfg"};
		
		//String[] strs = {"a", "b", "c"};
		System.out.println(solution(strs));

		
		//System.out.println("abcdef".indexOf("ab"));
	}

	public static String solution(String[] strs) {
		String firstStr = strs[0];
		int maxLength = 0;
		String maxStr = "";
		for(int i=0; i<firstStr.length(); i++) {
			String str = "";
			for(int j=0; j<=i; j++) {
				str += firstStr.charAt(j);
			}
			
			boolean chkStr = true;
			for(int k=1; k<strs.length; k++) {
				if(strs[k].indexOf(str) !=0) {
					chkStr = false;
					break;
				}
			}
			
			if(chkStr) {
				if(str.length() > maxLength) {
					maxLength = str.length();
					maxStr = str;
				}
			}else {
				break;
			}
		}
		
		return maxStr;
	}

}

package dn;

public class Test1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "abcaefg", "abcdefg", "abcdhfg" };

		// String[] strs = {"a", "b", "c"};
		System.out.println(solution(strs));

		// System.out.println("abcdef".indexOf("ab"));
	}

	public static String solution(String[] strs) {
		String firstStr = strs[0];
		int maxLength = 0;
		//String maxStr = "";
		StringBuilder maxStr = new StringBuilder();
		for (int i = 0; i < firstStr.length(); i++) {
			StringBuilder str = new StringBuilder();
			for (int j = 0; j <= i; j++) {
				str.append(firstStr.charAt(j));
			}

			for (int k = 1; k < strs.length; k++) {
				if (strs[k].indexOf(str.toString()) != 0) {
					//return maxStr;
					return maxStr.toString();
				}
			}

			if (str.length() > maxLength) {
				maxLength = str.length();
				//maxStr = str.toString();
				maxStr = str;
			}

		}

		//return maxStr;
		return maxStr.toString();
	}

}

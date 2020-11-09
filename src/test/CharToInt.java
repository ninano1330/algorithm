package test;

public class CharToInt {

	public static void main(String[] args) {

		String str = "1";
		System.out.println(
				Integer.parseInt(Character.toString(str.charAt(0))));
		System.out.println(
				Integer.parseInt(String.valueOf(str.charAt(0))));

		char c = '1';
		System.out.println(c-'0');
	}

}
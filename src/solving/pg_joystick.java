package solving;

public class pg_joystick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "JEROEN";
		//System.out.println(solution(name));
		name = "JAN";
		System.out.println(solution(name));
		
		
		
		System.out.println("BBBBA".indexOf('A'));
	}
	
	public static int solution(String name) {
		int count = 0;
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
		
			if(c == 'A') {
				continue;
			}
			
			count += getCntFindAlpha(c);
		}
		
		return count -1;
    }

	private static int getCntFindAlpha(char c) {
		return Math.abs(c - 'A') < Math.abs(c - 'Z') +1 ? Math.abs(c - 'A') : Math.abs(c - 'Z') +1;
	}
	
	private static int getCntMVCursor(String name) {
		int idx = 0;
		int cnt = 0;
		
		if(name.charAt(1) == 'A' || name.charAt(name.length()-1) == 'A') {
			
		}
	}
	
}

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_asList {
	public static void main(String args[]) {
		String[] participant = {"leo", "kiki", "eden","eden"};
		String[] completion = {"eden", "kiki","eden"};
		
		System.out.println(solution(participant,completion));
	}
	
	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		
        ArrayList<String> partAl = new ArrayList<String>(Arrays.asList(participant));
        ArrayList<String> compAl = new ArrayList<String>(Arrays.asList(completion));
        System.out.println(partAl.size());
        
        for(int i =0 ; i < compAl.size() ; i++) {
        	System.out.println("partAl.get(" + i + ") :  = " + partAl.get(i));
        	System.out.println("compAl.get(" + i + ") :  = " + compAl.get(i));
        	if(!partAl.get(i).equals(compAl.get(i))){
        		return partAl.get(i);
        	}
        }
        
        return partAl.get(partAl.size()-1);
    }
}

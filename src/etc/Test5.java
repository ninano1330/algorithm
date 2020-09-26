package etc;
import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		solution(progresses, speeds);
	}
	
	public static int[] solution(int[] progresses, int[] speeds) {
		
		int days = (100 - progresses[0]) / speeds[0];
		int done = 1;
		
	    List li = new ArrayList();
		
		for(int i=1; i < progresses.length; i++) {
			if(100 - progresses[i] - (speeds[i] * days) < 0) {
					done ++;
//					System.out.println("i : " + i);
//					System.out.println("done : " + done);
			}else {
				System.out.println("done : " + done);
				li.add(done);
//				System.out.println("i : " + i);
//				System.out.println("done : " + done);
				
//				System.out.println("done : " + done);
				days = (100 - progresses[i]) / speeds[i];
				done = 1;
				
			}
			
//			if(days == 0) {
//				days = (100 - progresses[i]) / speeds[i];
//				done ++;
//				System.out.println("i : " + i);
//				System.out.println("done : " + done);
//			}else if(100 - progresses[i] - (speeds[i] * days) < 0) {
//					done ++;
//					System.out.println("i : " + i);
//					System.out.println("done : " + done);
//			}else {
//				days = (100 - progresses[i]) / speeds[i];
//				done = 1;
//				System.out.println("i : " + i);
//				System.out.println("done : " + done);
//			}
		}
		
        int[] answer = new int[li.size()];
        
        for(int i=0; i < answer.length; i++) {
        	answer[i] = (int) li.get(i);
//        	System.out.println(li.get(i));
        }
        
        return answer;
    }

}

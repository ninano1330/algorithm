
public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = {2,6,8,14};
		
		System.out.println("ANSWER IS " + solution(arr));
	}
	
	
	public static int solution(int[] arr) {
	      int answer = 0;   
	      int j = 1;
	      int max = arr[arr.length-1];  
	      while(true){
	          int z = max * j;
	          int i = 0;
	          for(; i <= arr.length -2 ; i++){
	              if(z % arr[i] != 0){
	            	  System.out.println(z + " % " + arr[i] + " != 0");
	                  break;
	              }
	              if(i+1 > arr.length-2 ){
	            	  System.out.println(i+1 + " == " + (arr.length-2));
	                  return z;
	              }
	          }
	          j++;
	      }
	  }
}

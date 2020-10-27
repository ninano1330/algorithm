package nhn;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Main {
  private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame){
//    System.out.println((int)'A'); //65
//    System.out.println((int)'Z'); //90...................................................
	  
	  Deque<Character> deque = new ArrayDeque<Character>();
	  int[] sulCnt = new int[numOfAllPlayers];
	  
	  for(int i=1; i<=numOfAllPlayers; i++) {
		  deque.offerLast((char)(64+i));
	  }
	  
	  char sul = deque.pollFirst();
	  sulCnt[sul-65]++;
	  
	  for(int i=0; i <numOfGames; i++) {
		//  System.out.println("술래 : " + sul);
		  
		  if(numOfMovesPerGame[i] >0) {
			  for(int j=0; j<numOfMovesPerGame[i]; j++) {
				  char temp = deque.pollFirst();
			//	  System.out.println("지나간 플레이어 : " + temp );
				  deque.offerLast(temp);
			  }
		  }else {
			  int numOfMovesPerGame_convert = Math.abs(numOfMovesPerGame[i]);
			  for(int j=0; j<numOfMovesPerGame_convert; j++) {
				  char temp = deque.pollLast();
				 // System.out.println("지나간 플레이어 : " + temp );
				  deque.offerFirst(temp);
			  }
		  }
		  char canSul = deque.peekFirst();
		//  System.out.println("술래후보 : " + canSul);
		  
		  int chk = 0;
		  for(int z=0; z<namesOfQuickPlayers.length; z++) {
			 if(canSul == namesOfQuickPlayers[z]) {
				 chk = 1;
			 }
		  }
		  
		  if(chk==0) {
			  char tmp = sul;
			  
			  sul = deque.pollFirst();
			 // System.out.println("새로운 술래가 탄생했어요 : " + sul);
			 
			  deque.offerFirst(tmp);
			 // System.out.println(tmp + "이 자리에 앉았어요.");
		  }else {
			 // System.out.println("술래가 너무 빨라요 술래 그대로");
		  }
		 		  
		  sulCnt[sul-65]++;
		 // System.out.println("1게임 끝");
		 // System.out.println();
	  }
	  
	 // System.out.println("마지막 술래 : " + sul);
	  while(!deque.isEmpty()) {
		  char player = deque.peek();
		  
		  if(player != 'B') {
			  deque.poll();
			  deque.offer(player);
		  }else {
			  break;
		  }
	  }
	  
	  
	  while(!deque.isEmpty()) {
		  char player = deque.poll();
		  System.out.println(player + " " + sulCnt[player-65]);
	  }
	  
	  System.out.println(sul + " " + sulCnt[sul-65]);
  }

  private static class InputData {
    int numOfAllPlayers;
    int numOfQuickPlayers;
    char[] namesOfQuickPlayers;
    int numOfGames;
    int[] numOfMovesPerGame;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

      inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
      System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

      inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      inputData.numOfMovesPerGame = new int[inputData.numOfGames];
      String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
      for(int i = 0; i < inputData.numOfGames ; i++){
        inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
  }
}

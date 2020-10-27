package nhn;

import java.util.Scanner;

class Main2 {
  private static void solution(int day, int width, int[][] blocks) {
	  int[] widthArr = new int[width];
	  int count = 0;
	  
	  for(int i=0; i<blocks.length; i++) {
		  for(int j=0; j<blocks[i].length; j++) {
			widthArr[j] += blocks[i][j];
		  }
	  }

	  for(int i=0; i < widthArr.length-1; i++) {
		  int max = 0;
		  for(int j=i+1; j < widthArr.length; j++ ) {
			 if(widthArr[i] <= widthArr[j]) {
				 max = widthArr[j];
			 }
		  }
	  }
  }
  
  private static class InputData {
    int day;
    int width;
    int[][] blocks;
  }

  private static InputData processStdin() {
    InputData inputData = new InputData();

    try (Scanner scanner = new Scanner(System.in)) {
      inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));      
      inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
      
      inputData.blocks = new int[inputData.day][inputData.width];
      for (int i = 0; i < inputData.day; i++) {
        String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
        for (int j = 0; j < inputData.width; j++) {
          inputData.blocks[i][j] = Integer.parseInt(buf[j]);
        }
      }
    } catch (Exception e) {
      throw e;
    }

    return inputData;
  }

  public static void main(String[] args) throws Exception {
    InputData inputData = processStdin();

    solution(inputData.day, inputData.width, inputData.blocks);
  }
}

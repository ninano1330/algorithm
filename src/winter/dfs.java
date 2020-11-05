package winter;

public class dfs {
    static boolean[][] check;
    static int[][] map;
    static int[] answer;
    private static int[] X = {-1, 0, 1, 0};
    private static int[] Y = {0, 1, 0, -1};
    static int len;

    public static void main(String[] args) {
        solution(new int[][]{{0, 0, 1, 1}, {1, 1, 1, 1}, {2, 2, 2, 1}, {0, 0, 0, 2}});
//        solution(new int[][]{{0,0,1},{2,2,1},{0,0,0}});
    }

    public static int[] solution(int[][] v) {
        len = v.length;
        map = v;
        check = new boolean[len][len];
        answer = new int[3];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (!check[i][j]) {
                    dfs(j, i);
                    answer[map[i][j]]++;
                }
            }
        }

        return answer;
    }

    private static void dfs(int x, int y) {
        check[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + X[i];
            int ny = y + Y[i];

            if (nx >= 0 && ny >= 0 && nx < len && ny < len && !check[ny][nx] && map[ny][nx] == map[y][x])
                dfs(nx, ny);

        }


    }
}
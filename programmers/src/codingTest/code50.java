import java.io.*;

public class code50 {

    public static int solution(int[][] signals) {
        int answer = 0;

        int len = 1;

        for (int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            len *= (g + y + r);
        }

        int[] arr = new int[len + 1];

        for (int i = 0; i < signals.length; i++) {
            int g = signals[i][0];
            int y = signals[i][1];
            int r = signals[i][2];

            int offset = g + y + r;

            for (int j = 1; j <= len; j += offset) {
                for (int k = 0; k < y; k++) {
                    arr[g + j + k]++;
                }
            }
        }

        for (int i = 1; i <= len; i++) {
            if (arr[i] == signals.length) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] signals = new int[n][3];

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");

            signals[i][0] = Integer.parseInt(input[0]);
            signals[i][1] = Integer.parseInt(input[1]);
            signals[i][2] = Integer.parseInt(input[2]);
        }

        System.out.println(solution(signals));
    }
}
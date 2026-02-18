package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = N; i > 0; i--) {        // 줄 개수
            for (int j = 0; j < i; j++) {   // 별 개수
                sb.append("*");
            }
            sb.append("\n");               // 줄바꿈
        }
        System.out.print(sb.toString());
    }
}

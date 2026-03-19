package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if (T % 10 != 0) {
            System.out.println(-1);
            return;
        }
        int A = 300;
        int B = 60;
        int C = 10;
        int A_count = T / A;
        T %= A;
        int B_count = T / B;
        T %= B;
        int C_count = T / C;
        T %= C;

        System.out.println(A_count + " " + B_count + " " + C_count);
    }
}

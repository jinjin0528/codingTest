package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bronze_2061 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger K = new BigInteger(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int i = 2; i < L; i++) {
            if (K.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                System.out.println("BAD " + i);
                return;
            }
        }
        System.out.println("GOOD");
    }
}

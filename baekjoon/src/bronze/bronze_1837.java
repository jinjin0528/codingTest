package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class bronze_1837 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger P =  new BigInteger(st.nextToken());
        BigInteger K =  new BigInteger(st.nextToken());

        for (int i = 2; i < K.intValue(); i++) {
            if (isPrime(i)) {
                if (P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)) {
                    System.out.println("BAD " + i);
                    return;
                }
            }
        }
        System.out.println("GOOD");
    }
}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bronze_1247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t = 0; t < 3; t++) {
            int N = Integer.parseInt(br.readLine());
            BigInteger S = BigInteger.ZERO;

            for(int i = 0; i < N; i++){
                BigInteger num = new BigInteger(br.readLine());
                S = S.add(num);
            }

            if(S.equals(BigInteger.ZERO)) System.out.println(0);
            else if(S.compareTo(BigInteger.ZERO) > 0) System.out.println("+");
            else System.out.println("-");
        }
    }
}

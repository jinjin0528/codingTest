package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bronze_2547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            br.readLine();  // 공백
            int N = Integer.parseInt(br.readLine());
            BigInteger sum = new BigInteger("0");
            for(int j=0;j<N;j++){
                sum = sum.add(new BigInteger(br.readLine()));
            }
            System.out.println((String.valueOf(sum.remainder(BigInteger.valueOf(N))).equals("0"))? "YES":"NO");
        }
    }
}

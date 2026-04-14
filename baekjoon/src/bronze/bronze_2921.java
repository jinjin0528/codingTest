package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for(int i =0; i<=N;i++){
            for(int j =i; j<=N;j++){
                ans += i+j;
            }
        }
        System.out.println(ans);
    }
}

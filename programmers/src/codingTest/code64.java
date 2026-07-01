package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code64 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int start = Integer.parseInt(br.readLine());
        int end = Integer.parseInt(br.readLine());
        int leng = end - start;
        int[] ans = new int[leng +1];
        int idx = 0;
        for(int i=start; i<= end;i++){
            ans[idx++] = i;
        }
        System.out.println(Arrays.toString(ans));
    }
}

package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code63 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int[] ans = new int[n/k];
        int idx = 0;

        for(int i=1;i<=n;i++){
            if(i%k==0){
                ans[idx] += i;
                idx++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}

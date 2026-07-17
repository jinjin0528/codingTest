package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code76 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st[i]);
        }
        int idx = 0;
        for(int m:num){
            while(m != 1){
                m = (m%2 == 0) ? m/2 : (m-1)/2;
                idx++;
            }
        }
        System.out.println(idx);
    }
}

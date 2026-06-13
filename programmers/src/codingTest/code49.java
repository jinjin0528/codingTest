package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code49 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] num_list = new int[n];
        for (int i = 0; i < n; i++) {
            num_list[i] = Integer.parseInt(st[i]);
        }
        int res = 0;
        if(num_list.length >= 11){
            for(int m:num_list){
                res += m;
            }
        }else{
            res = 1;
            for(int m:num_list){
                res *= m;
            }
        }
        System.out.println(res);
    }
}

package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code33 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int m = st.length;
        int[] num_list = new int[m];
        for (int i = 0; i < m; i++) {
            num_list[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int size = (num_list.length + n-1)/n;
        int[] answer = new int[size];
        int idx = 0;
        for(int i=0;i<num_list.length;i+=n){
            answer[idx] = num_list[i];
            idx++;
        }
        System.out.println(Arrays.toString(answer));
    }
}

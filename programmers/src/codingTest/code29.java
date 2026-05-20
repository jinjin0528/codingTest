package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code29 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int m = st.length;
        int[] num_list = new int[m];
        for(int i=0;i<m;i++){
            num_list[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = num_list[i];
        }
        System.out.print(Arrays.toString(answer));
    }
}

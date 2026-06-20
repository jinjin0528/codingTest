package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code56 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int m = st.length;
        int[] num_list = new int[m];
        for (int i = 0; i < m; i++) {
            num_list[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[num_list.length];
        System.arraycopy(num_list,n,ans, 0, num_list.length - n);
        System.arraycopy(num_list,0,ans, num_list.length - n, n);
        System.out.println(Arrays.toString(ans));

    }
}

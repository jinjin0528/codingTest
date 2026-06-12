package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code48 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        String ex = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            if (!String.valueOf(num).contains(ex)) {
                sb.append(num).append(" ");
            }
        }

        System.out.println(sb.toString().trim());
    }
}

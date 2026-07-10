package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code69 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] numLog = new int[n];
        for(int i=0;i<n;i++){
            numLog[i] = Integer.parseInt(st[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i - 1] == 1) {
                sb.append("w");
            } else if (numLog[i] - numLog[i - 1] == -1) {
                sb.append("s");
            } else if (numLog[i] - numLog[i - 1] == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
        }
        String ans = sb.toString();
        System.out.println(ans);
    }
}

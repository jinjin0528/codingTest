package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code77 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] indices = new int[n];
        for(int i=0;i<n;i++){
            indices[i] = Integer.parseInt(st[i]);
        }
        String[] ans = str.split("");
        for(int idx:indices) ans[idx]="";
        System.out.println(String.join("",ans));
    }
}

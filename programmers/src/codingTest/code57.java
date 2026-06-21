package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code57 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        int idx = Integer.parseInt(br.readLine());
        for(int i=idx;i<arr.length;i++){
            if(arr[i] == 1){
                System.out.println(i);
                break;
            }else {
                System.out.println(-1);
            }
        }
     }
}

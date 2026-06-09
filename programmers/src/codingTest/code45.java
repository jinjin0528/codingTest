package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code45 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        int k = Integer.parseInt(br.readLine());
        if(k%2==0) {
            for(int i=0;i<arr.length;i++){
                arr[i] += k;
            }
        }else {
            for(int i=0;i<arr.length;i++){
                arr[i] *= k;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

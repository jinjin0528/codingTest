package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class code30 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int m = st.length;
        int[] arr =  new int[m];
        for(int i = 0; i < m; i++){
            arr[i] = Integer.parseInt(st[i]);
        }
        int n = Integer.parseInt(br.readLine());
        if(arr.length % 2 ==1){
            for(int i=0;i<arr.length;i+=2){
                arr[i] += n;
            }
        } else {
            for(int i=1;i<arr.length;i+=2){
                arr[i] += n;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

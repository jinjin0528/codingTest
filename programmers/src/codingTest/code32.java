package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st1 = br.readLine().split(" ");
        int n1 = st1.length;
        int[] arr1 = new int[n1];
        String[] st2 = br.readLine().split(" ");
        int n2 = st2.length;
        int[] arr2 = new int[n2];
        for(int i = 0; i < n1; i++){
            arr1[i] = Integer.parseInt(st1[i]);
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = Integer.parseInt(st2[i]);
        }
        int answer = 0;
        if(arr1.length != arr2.length){
            answer = arr1.length > arr2.length ? 1:-1;
        } else {
            int sum1 = 0, sum2 = 0;
            for(int n :arr1) sum1 += n;
            for(int n : arr2) sum2 += n;
            if (sum1>sum2) answer = 1;
            else if (sum2> sum1) answer = 1;
            else answer = 0;
        }
        System.out.println(answer);
    }
}

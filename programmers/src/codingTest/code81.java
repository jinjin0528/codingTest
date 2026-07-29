package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code81 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int n = str.length;
        int[] arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int start = -1;
        int end = -1;

        for(int i=0;i<n;i++){
            if(arr[i] == 2){
                start = i;
                break;
            }
        }
        for(int i=n-1;i>-1;i++){
            if(arr[i]==2){
                end = i;
                break;
            }
        }

        if (start == -1 && end == -1) {
            System.out.println(Arrays.toString(new int[]{-1}));
        } else {
            int[] result = Arrays.copyOfRange(arr, start, end + 1);
            System.out.println(Arrays.toString(result));
        }
    }
}

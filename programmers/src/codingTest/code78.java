package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code78 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

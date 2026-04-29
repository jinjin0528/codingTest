package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = input.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(input[i]);
        }
        int N = Integer.parseInt(br.readLine());
        int len = num_list.length;
        int answer = 0;
        for(int i = 0;i<len;i++){
            if(num_list[i]==n) answer = 1;
        }
        System.out.println(answer);
    }
}

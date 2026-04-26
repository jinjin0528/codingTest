package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = input.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(input[i]);
        }
        int[] answer = new int[n+1];
        for(int i=0;i<n;i++){
            answer[i] = num_list[i];
        }
        int last = num_list[n-1];
        int prev = num_list[n-2];

        if(last>prev){
            answer[n] = last-prev;
        } else {
            answer[n] = last*2;
        }
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
}

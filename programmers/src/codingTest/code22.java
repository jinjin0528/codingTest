package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = input.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num_list);
//        int m = 5;
        int[] answer = new int[num_list.length - 5];
        for(int i = 5;i<num_list.length;i++){
            answer[i-5] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}

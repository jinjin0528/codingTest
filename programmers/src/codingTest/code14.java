package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code14 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = input.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(input[i]);
        }

        int answer = 0;
        String odd = "";
        String even = "";
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2 == 0){
                even += Integer.toString(num_list[i]);
            }else {
                odd += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        System.out.println(answer);
    }
}

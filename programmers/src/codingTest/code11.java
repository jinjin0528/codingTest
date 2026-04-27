package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = input.length;
        int[] num_list = new int[n];
        for(int i=0;i<n;i++){
            num_list[i] = Integer.parseInt(input[i]);
        }
        int sum = 0;
        int multiple = 1;
        for(int i=0;i<num_list.length;i++){
            sum += num_list[i];
            multiple *= num_list[i];
        }
        if(multiple < sum * sum) System.out.println(1);
        else  System.out.println(0);;
    }
}

package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code18 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String[] input = br.readLine().split(" ");
        int n = input.length;
        int[] index_list = new int[n];
        for(int i=0;i<n;i++){
            index_list[i] = Integer.parseInt(input[i]);
        }
        String answer = "";
        for(int i=0; i<index_list.length;i++){
            answer += my_string.charAt(index_list[i]);
        }
        System.out.println(answer);
    }
}

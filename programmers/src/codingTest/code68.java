package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code68 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] my_str = br.readLine().split(" ");
        int[][] part = new int[my_str.length][2];
        for (int i = 0; i < my_str.length; i++) {
            String[] input = br.readLine().split(", ");
            part[i][0] = Integer.parseInt(input[0]);
            part[i][1] = Integer.parseInt(input[1]);
        }
        StringBuilder sb =new StringBuilder();
        for(int i =0;i<my_str.length;i++){
            sb.append(my_str[i].substring(part[i][0], part[i][1] + 1));
        }
        System.out.println(sb.toString());
    }
}

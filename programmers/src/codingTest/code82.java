package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code82 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] cnt = new int[31];
        for(String arr:str){
            cnt[arr.length()]++;
        }
        int n = Arrays.stream(cnt).max().getAsInt();
        System.out.println(n);

    }
}

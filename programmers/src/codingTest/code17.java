package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code17 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int n = input1.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(input1[i]);
        }
        String[] input2 = br.readLine().split(" ");
        int m = input2.length;
        int[] delete_list = new int[m];
        for(int i=0;i<n;i++){
            delete_list[i] = Integer.parseInt(input2[i]);
        }

        List<Integer> answer = new ArrayList<>();
        for(int num:arr){
            answer.add(num);
        }
        for(int num:delete_list){
            answer.remove((Integer)num);
        }
        int[] result = answer.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(result));
    }
}

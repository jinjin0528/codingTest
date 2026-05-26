package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class code34 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = st.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
 //       int[] res = ans.stream().mapToInt(Integer::intValue).toArray();
 //       System.out.println(Arrays.toString(res));
    }
}

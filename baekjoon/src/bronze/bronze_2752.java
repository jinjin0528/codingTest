package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bronze_2752 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [3];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);   // 오름차순
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
//      내림차순
//        for (int i = 2; i >= 0; i--) {
//            System.out.print(arr[i] + " ");
//        }
    }
}

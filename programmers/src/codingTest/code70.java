package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class code70 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 배열 크기
        int n = Integer.parseInt(br.readLine());

        // 배열 입력
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // intervals 입력
        int[][] intervals = new int[2][2];

        for (int i = 0; i < 2; i++) {
            input = br.readLine().split(" ");
            intervals[i][0] = Integer.parseInt(input[0]);
            intervals[i][1] = Integer.parseInt(input[1]);
        }

        // 결과 저장
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            for (int j = start; j <= end; j++) {
                list.add(arr[j]);
            }
        }

        // 출력
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}

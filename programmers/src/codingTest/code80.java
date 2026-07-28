package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code80 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 주문 배열 생성
        String[] order = new String[n];

        // 주문 입력
        for (int i = 0; i < n; i++) {
            order[i] = br.readLine();
        }

        int answer = 0;

        // 가격 계산
        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("americano") || order[i].contains("anything")) {
                answer += 4500;
            } else {
                answer += 5000;
            }
        }

        // 결과 출력
        System.out.println(answer);
    }
}

package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code62 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine();
        String answer = "";
        int mode = 0;
        char[] arr = code.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                mode = 1 - mode;
            } else if (i % 2 == mode) {
                answer += arr[i] + "";
            }
        }

        if (answer.equals("")) {
            System.out.println("EMPTY");
        }

        System.out.println(answer);

    }
}

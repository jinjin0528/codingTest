package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class code6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[st.countTokens()];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());

        int[] answer = new int[num2 - num1 + 1];
        for(int i = num1, idx = 0; i <= num2; i++){
            answer[idx++] = numbers[i];
        }

        for(int i : answer){
            System.out.print(i + " ");
        }
    }
}

package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        for(int i=0; i<str.length(); i++) { // length길이 만큼 반복
            System.out.print(str.charAt(i)); // char로 하나하나 프린트
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}

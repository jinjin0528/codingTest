package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class code54 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] names = br.readLine().split(" ");
        int count = (names.length+4)/5;
        String[] answer = new String[count];
        for(int i = 0;i<count;i++){
            answer[i] = names[i*5];
        }
        System.out.println(Arrays.toString(answer));
    }
}

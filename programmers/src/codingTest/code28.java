package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code28 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String my_string = br.readLine();
        String is_suffix = br.readLine();
        if(my_string.endsWith(is_suffix)){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

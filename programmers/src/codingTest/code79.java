package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class code79 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str =  br.readLine();
        String s = str.replaceAll("[a-c]", " ");
        if(s.trim().isEmpty()){
            System.out.println("EMPTY");
        } else {
            String[] arr = s.trim().split("\\s+");

            for(String st:arr){
                System.out.println(st);
            }
        }
    }
}

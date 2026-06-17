package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class code53 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] todo_list = br.readLine().split(" ");
        String[] st = br.readLine().split(" ");
        boolean[] finished = new boolean[st.length];
        for (int i = 0; i < st.length; i++) {
            finished[i] = Boolean.parseBoolean(st[i]);
        }

        List<String> list = new ArrayList<>();

        for(int i=0;i< finished.length;i++){
            if(!finished[i]){
                list.add(todo_list[i]);
            }
        }
        String[] answer = list.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
    }
}

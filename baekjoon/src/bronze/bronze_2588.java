package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        char []b = br.readLine().toCharArray();
        int bNum = Integer.parseInt(new String(b));
        System.out.println(a*(b[2]-'0'));
        System.out.println(a*(b[1]-'0'));
        System.out.println(a*(b[0]-'0'));
        System.out.println(a*bNum);
    }
}

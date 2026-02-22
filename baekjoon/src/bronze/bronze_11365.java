package bronze;

import java.io.*;

public class bronze_11365 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String s = br.readLine();
            if (s.equals("END")) break;

            bw.write(new StringBuilder(s).reverse().toString());
            bw.newLine();
        }

        bw.flush();
    }
}

package bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bronze_25314 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int repeat = N/4;
        for(int i=0;i<repeat;i++){
            System.out.print("long ");
        }
        System.out.println("int");

    }
}

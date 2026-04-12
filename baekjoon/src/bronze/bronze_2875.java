package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bronze_2875 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int team = Math.min(N/2, M);  //인턴 나가는 학생들도 포함해서 만들 수 있는 최대 팀의 개수
        //최대 팀의 개수에 맞춰 학생 수를 빼준다
        M -= team;
        N -= 2*team;
        int leftOver = N+M-K;  // 남은 학생 수 - 인턴을 나가야 하는 학생 수
        // leftOver가 0 이상이면 문제 없으므로 그대로 팀의 개수를 출력
        if (leftOver >= 0) {
            System.out.print(team);
        } else {  // leftOver가 음수이면
            leftOver = Math.abs(leftOver);
            int minus = (int) Math.ceil((double) leftOver / 3.0);
            if (team - minus >= 0) {
                System.out.print(team - minus);
            } else {
                System.out.print(0);
            }
        }
    }
}

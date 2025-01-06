package BaekJoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2439
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class BackwardStars {

    public void oldMemories () throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalCount = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < totalCount ; i++) {
            for (int j = 1 ; j <= totalCount ; j++) {
                if(j <= totalCount - i - 1) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        bf.close();
    }
}

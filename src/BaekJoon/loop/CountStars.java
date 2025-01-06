package BaekJoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2438
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 */
public class CountStars {

    public void howManyStarsCanYouPrint() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        int innerCount = 0;

        for(int i = 0 ; i < count; i ++) {
            innerCount += 1;
            for(int j = 0 ; j < innerCount ; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        bf.close();
    }
}

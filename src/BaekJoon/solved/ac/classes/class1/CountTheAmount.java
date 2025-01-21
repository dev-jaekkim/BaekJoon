package BaekJoon.solved.ac.classes.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2475
 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
 * 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 *
 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면,
 * 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
 *
 * 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
 *
 * 첫째 줄에 검증수를 출력한다.
 */
public class CountTheAmount {

    public void koiHereWeCome() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(input, " ");

        double result = Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2);

        System.out.println(result%10);

    }
}

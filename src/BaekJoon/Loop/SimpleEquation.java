package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 10950
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오
 * <p>
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * <p>
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class SimpleEquation {

    public void loopingInputStream() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String testCasesString = bf.readLine();
        int testCasesCount = Integer.parseInt(testCasesString);

        for (int i = 0; i < testCasesCount; i++) {
            String equationLine = bf.readLine();
            StringTokenizer st = new StringTokenizer(equationLine, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }

        bf.close();
    }
}

package BaekJoon.Loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 11021
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 */
public class SimpleEquationWithNumbers {

    public void moreFaster() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String totalCountString = bf.readLine();
        int totalCount = Integer.parseInt(totalCountString);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= totalCount; i++) {
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");

            //total
            String sumNumbers = bf.readLine();
            StringTokenizer st = new StringTokenizer(sumNumbers, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b);
            sb.append("\n");
        }

        System.out.println(sb);
        bf.close();
    }
}

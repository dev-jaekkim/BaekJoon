package BaekJoon.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 11022
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0<A, B<10)
 *
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
 * x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class SimpleEquationGettingComplex {

    public void gettingBitBoring() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1 ; i <= count; i++) {
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");

            String nextLine = bf.readLine();
            StringTokenizer st = new StringTokenizer(nextLine, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a);
            sb.append(" + ");
            sb.append(b);
            sb.append(" = ");
            sb.append(a+b);
            sb.append("\n");
        }

        System.out.println(sb);
        bf.close();
    }
}

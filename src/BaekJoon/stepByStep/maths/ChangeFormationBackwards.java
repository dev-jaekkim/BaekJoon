package BaekJoon.stepByStep.maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 11005
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */
public class ChangeFormationBackwards {

    public void backwards() throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(input, " ");

        int NumberToSolve = Integer.parseInt(st.nextToken());
        int formation = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while(NumberToSolve > formation) {

            char c = 'a';

            if(NumberToSolve % formation > 10 ) {
                c = (char) ((NumberToSolve % formation) + 55);
            } else {
                c = (char) ((NumberToSolve % formation) + 48);
            }

            NumberToSolve = NumberToSolve / formation;
            sb.insert(0, c);
        }
        System.out.println(sb);
    }
}

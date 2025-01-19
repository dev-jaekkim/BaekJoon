package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 백준 4153
 * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
 * 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
 */
public class RightTriangle {

    public void pitagoras() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = bf.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int ausar = Integer.parseInt(st.nextToken());
            int auset = Integer.parseInt(st.nextToken());
            int heru = Integer.parseInt(st.nextToken());

            if (ausar == 0 && auset == 0 && heru == 0) {
                break;
            }

            int[] lines = new int[3];
            lines[0]= ausar;
            lines[1] = auset;
            lines[2] = heru;

            Arrays.sort(lines);

            if (lines[2] * lines[2] == lines[0] * lines[0] + lines[1] * lines[1]) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }

}
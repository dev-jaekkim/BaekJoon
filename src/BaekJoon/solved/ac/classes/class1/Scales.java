package BaekJoon.solved.ac.classes.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2920
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * <p>
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * <p>
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 * <p>
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 * <p>
 * 첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.
 */
public class Scales {

    public void tellMeTheOrder() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(inputLine, " ");

        // 첫째 숫자가 1 이면 ascending or mixed
        // 8이면 descending or mixed

        int firstNumber = Integer.parseInt(st.nextToken());
        int countNumber = firstNumber;

        for (int i = 0; i < 7; i++) {

            if (firstNumber == 1 && i == 0) {
                countNumber++;
            }

            if (firstNumber == 8 && i == 0) {
                countNumber--;
            }

            int nextNumber = Integer.parseInt(st.nextToken());

            // ascending 2 , 2
            if (nextNumber == countNumber) {
                if (firstNumber == 1) {
                    countNumber++;
                }

                if (firstNumber == 8) {
                    countNumber--;
                }
            } else {
                System.out.println("mixed");
                break;
            }
        }

        if (countNumber == 8) {
            System.out.println("ascending");
        }

        if (countNumber == 0) {
            System.out.println("descending");
        }
    }
}

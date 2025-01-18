package BaekJoon.advanced.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2444
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어보세요
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 */
public class PrintingStars {

    public void countingStars() throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(bf.readLine());
        bf.close();

        int totalLine = inputNumber * 2 - 1;
        int totalBlank = totalLine / 2;
        int firstStar = 1;

        StringBuilder sb = new StringBuilder();
        boolean goingDownWards = true;

        for (int i = 0; i < totalLine; i++) {

            if (goingDownWards) {
                for (int j = 0; j < totalBlank; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < firstStar; k++) {
                    sb.append("*");
                }

                totalBlank -= 1;
                firstStar += 2;
                sb.append(System.lineSeparator());

                if (firstStar > totalLine) {
                    totalBlank += 1;
                    firstStar -= 2;
                    goingDownWards = false;
                }
            }

            if (!goingDownWards && firstStar > 1) {
                totalBlank += 1;
                firstStar -= 2;

                for (int j = 0; j < totalBlank; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < firstStar; k++) {
                    sb.append("*");
                }

                if(firstStar > 1){
                    sb.append(System.lineSeparator());
                }

            }
        }
        System.out.print(sb);
    }
}

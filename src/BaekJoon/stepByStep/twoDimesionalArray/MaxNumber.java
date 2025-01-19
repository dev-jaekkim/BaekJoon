package BaekJoon.stepByStep.twoDimesionalArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2566
 * <그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
 * 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
 * <p>
 * 예를 들어, 다음과 같이 81개의 수가 주어지면
 * 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
 */
public class MaxNumber {
    public void havingFunMatrix() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int maxNumber = 0;
        int maxRow = 0;
        int maxColumn = 0;

        int[][] hugeMatrix = new int[10][10];

        for (int i = 1; i <= 9; i++) {
            String newLine = bf.readLine();
            StringTokenizer st = new StringTokenizer(newLine, " ");

            for (int j = 1; j <= 9; j++) {
                hugeMatrix[i][j] = Integer.parseInt(st.nextToken());

                if (hugeMatrix[i][j] > maxNumber) {
                    maxNumber = hugeMatrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println(maxNumber);
        System.out.println(maxRow + " " + maxColumn);

    }
}

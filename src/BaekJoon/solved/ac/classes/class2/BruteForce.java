package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2231
 * 어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
 * 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다.
 * 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
 * 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 * <p>
 * 자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 */
public class BruteForce {

    public void theSmallest() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int targetNumber = Integer.parseInt(bf.readLine());
        bf.close();
        int result = 0;

        for (int i = 1; i <= targetNumber; i++) {
            int sum = 0;
            int tempNum = i;
            while (tempNum != 0) {
                sum += tempNum % 10;
                tempNum /= 10;
            }

            if (sum + i == targetNumber) {
                result = i;
                break;
            }
        }

        System.out.println(result);

    }
}

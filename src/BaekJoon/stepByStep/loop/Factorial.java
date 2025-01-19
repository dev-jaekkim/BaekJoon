package BaekJoon.stepByStep.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 8393
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 1부터 n까지 합을 출력한다.
 */
public class Factorial {

    public void addNumbers() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        bf.close();

        int initialNumber = Integer.parseInt(str);
        int finalSum = 0;

        for (int i = 1; i <= initialNumber; i++) {
            finalSum += i;
        }

        System.out.println(finalSum);
    }
}

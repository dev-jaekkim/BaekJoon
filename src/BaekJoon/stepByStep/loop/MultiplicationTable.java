package BaekJoon.stepByStep.loop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2739
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 * 출력형식과 같게 N*1부터 N*9까지 출력한다.
 */
public class MultiplicationTable {

    public void timesTable() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        bf.close();

        int a = Integer.parseInt(str);

        for (int i = 1; i < 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }
}

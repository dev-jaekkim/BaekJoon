package BaekJoon.solved.ac.classes.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2741
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
public class PrintN {

    public void letsPrint() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int lastNumber = Integer.parseInt(bf.readLine());
        bf.close();

        for (int i = 1; i <= lastNumber; i++) {
            System.out.println(i);
        }
    }
}

package BaekJoon.inputOutput;

import sun.lwawt.macosx.CSystemTray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2588
 * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *       4 7 2  (1)
 *     X 3 8 5  (2)
 * -------------
 *     2 3 6 0  (3)
 *   3 7 7 6    (4)
 * 1 4 1 6      (5)
 * ------------
 * 1 8 1 7 2 0  (6)
 *
 * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
public class ThreeDigitMultiple {

    public void multiply() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        String str2 = bf.readLine();
        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str2);

        int hundredB = b/100;
        int tenB = (b - hundredB*100)/10;
        int oneB = (b - (hundredB*100) -(tenB*10) );

        System.out.println(a * oneB);
        System.out.println(a * tenB);
        System.out.println(a * hundredB);
        System.out.println(a * b);
        bf.close();

    }
}

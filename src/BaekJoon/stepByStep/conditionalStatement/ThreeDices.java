package BaekJoon.stepByStep.conditionalStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2480
 * 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 * <p>
 * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 * 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
 * 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
 * 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 * <p>
 * 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 * <p>
 * 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 * 첫째 줄에 게임의 상금을 출력 한다.
 */
public class ThreeDices {

    public void thePrizeMoneyCalculation() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 1. 모두 같은 눈인 경우 : 10,000원+(같은 눈)×1,000원
        // 2. 2개만 같은 눈인 경우 : 1,000원+(같은 눈)×100원
        // 3. 모두 다른 눈인 경우 : (그 중 가장 큰 눈)×100원

        // 모두 같은 숫자인 경우
        int prizeMoney = 0;

        if (a == b && b == c) {
            prizeMoney = a * 1000 + 10000;
            System.out.println(prizeMoney);
        } else if (a == b || a == c) {
            prizeMoney = a * 100 + 1000;
            System.out.println(prizeMoney);
        } else if (b == c) {
            prizeMoney = b * 100 + 1000;
            System.out.println(prizeMoney);
        } else {
            System.out.println(Math.max(a, Math.max(b, c))*100);
        }

    }
}

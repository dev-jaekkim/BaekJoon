package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2869
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 *
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
 * 또, 정상에 올라간 후에는 미끄러지지 않는다.
 *
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 * 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */
public class SnailGoingUp {

    public void snailCrawl() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(inputLine, " ");
        int meterItMovedOnOneDay = Integer.parseInt(st.nextToken());
        int slippedMeters = Integer.parseInt(st.nextToken());
        int goalMeters = Integer.parseInt(st.nextToken());

        int daysItTook = 0;
        int resultMeter = 0;

        while (resultMeter < goalMeters) {
            daysItTook++;
            resultMeter += meterItMovedOnOneDay;

            if (resultMeter != goalMeters) {
                resultMeter -= slippedMeters;
            }
        }
        System.out.println(daysItTook);
    }

    public void cleverWay () throws Exception {
        // (goalMeters - slippedMeters) / (meterItMovedOnOneDay - slippedMeters)
        // 5 / 2-1 = 5/1 = 5일
        // 6 / 5-1 = 6/4 = 2.5일 -> 2일

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        StringTokenizer st = new StringTokenizer(inputLine , " ");
        bf.close();
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int day = (goal - down) / (up - down);

        if((goal - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}

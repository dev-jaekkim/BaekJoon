package BaekJoon.stepByStep.conditionalStatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2525
 * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
 * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
 * 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
 * <p>
 * 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
 * <p>
 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 * <p>
 * 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
 * <p>
 * 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다.
 * 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
 */
public class OvenClock {

    public void howLongDoesItTakes() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        String str2 = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(str, " ");

        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinute = Integer.parseInt(st.nextToken());
        int cookingMinute = Integer.parseInt(str2);

        // 분은 60분을 넘기면, 무조건 시간에 추가해야함.

        // 시간은 24시를 넘기면, 0으로 바뀜. 48 / 24 = 2 ... 0 > 0 / 49 / 24 .. 1
        // 시간은 24로 나눠서 나머지 51 % 24 = 2.. 3
        // 120분 / 60 =  2 시간을 더함 , ... 0 분

        // 분을 60으로 나눔
        // 몫은 시간에 더함.
        // 더한 시간은 다시 24로 나눔 나머지가 요리 예정 시간
        // 나머지는 분

        int x = currentMinute + cookingMinute;

        int addedHour = x / 60;
        int leftMinute = x % 60;

        int finalHour = (currentHour + addedHour) % 24;

        System.out.println(finalHour + " " + leftMinute);
    }
}

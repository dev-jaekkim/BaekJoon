package BaekJoon.stepByStep.conditionalStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2884
 * 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만,
 * 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
 * 상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
 * 이런 상근이를 불쌍하게 보던 창영이는 자신이 사용하는 방법을 추천해 주었다.
 * 바로 "45분 일찍 알람 설정하기"이다.
 * 이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
 * 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
 * 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
 * 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
 * <p>
 * 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
 * <p>
 * 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고,
 * 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
 */
public class AlarmClock {

    public void earlyAlarm() throws Exception {
        // 분이 45보다 작은 경우,
        // 시간에서 1 빼고, 분에 60을 더함. 그 다음에 45를 뺌.

        // 하지만 이때, 시간이 0인 경우 시간은 23으로 바뀜.

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(str, " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {

            if (hour == 0) {
                hour = 23;
            } else {
                hour -= 1;
            }
            minute = minute + 15;
        } else {
            minute = minute - 45;
        }
        System.out.println(hour + " " + minute);
    }
}

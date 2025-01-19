package BaekJoon.stepByStep.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2675
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 *
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8),
 * 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
 *
 * 각 테스트 케이스에 대해 P를 출력한다.
 */
public class RepeatOfStrings {

    public void letsPrint() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalInputs = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i <totalInputs ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int repeatCount = Integer.parseInt(st.nextToken());
            String letters = st.nextToken();
            for(int k = 0 ; k < letters.length(); k++) {
                for(int j = 0 ; j < repeatCount ; j++) {
                    sb.append(letters.charAt(k));
                }
            }
            sb.append(System.lineSeparator());
        }
        bf.close();
        System.out.println(sb);
    }
}

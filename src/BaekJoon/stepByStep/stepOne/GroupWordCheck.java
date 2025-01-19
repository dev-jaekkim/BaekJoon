package BaekJoon.stepByStep.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 1316
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * <p>
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 */
public class GroupWordCheck {

    public void groupWordCount() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalInput = Integer.parseInt(bf.readLine());
        int resultCount = totalInput;

        for (int i = 0; i < totalInput; i++) {
            boolean[] alphabet = new boolean[26];
            String word = bf.readLine();
            //가장 첫 번째 단어 세팅 진행
            alphabet[(int) word.charAt(0) - 97] = true; // 등장했다는 의미로 true를 주는 것

            for (int j = 1; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == word.charAt(j - 1)) { // 연속된 숫자이므로 동일한 단어로 판별 진행
                    continue;
                }

                if (alphabet[(int) c - 97]) {
                    resultCount--;
                    break;
                }
                alphabet[(int) c - 97] = true;
            }
        }

        bf.close();
        System.out.println(resultCount);
    }
}

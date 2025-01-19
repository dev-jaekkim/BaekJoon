package BaekJoon.stepByStep.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 10809
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
 * 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */
public class FindTheAlphaBet {
    public void whichAlphaBetAreYou() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        StringBuilder sb = new StringBuilder();

        // baekjoon
        // 1. 알파벳 순서로 단어 찾기
        // 2. 단어 찾으면 해당 단어의 위치 기록
        // 3. append 하고 다음 알파벳으로 넘어가기

        for (int i = 0 ; i < 26 ; i++) {
            char code = (char) (i+97); // a
            int number = word.indexOf(code);
            sb.append(number);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}

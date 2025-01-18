package BaekJoon.advanced.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 10988
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
 * <p>
 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
 * <p>
 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
 */
public class Penlidrome {

    public void areYouPenlidrome() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        int wordLength = word.length();
        bf.close();
        // 절반까지 하나씩 저장해두기
        // level
        // l e 저장
        // v 무시
        // e 비교 l 비교 (뒷 순서부터 비교해야함)

        // 순서대로 하나씩 저장함.
        // 가운데 순서가 오면 저장 멈춤.
        // 하나씩 전부 비교 진행
        // 거꾸로 꺼내서 비교해야함.

        // level = 5  / 2 = 2 번 비교 진행
        // 0 1 2 3 4
        // l / l
        // e / e
        int result = 0;

        for (int i = 0; i < wordLength / 2; i++) {
            if (word.charAt(i) == word.charAt(wordLength - 1 - i)) {
                result += 1;
            }
        }

        if (result == wordLength / 2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

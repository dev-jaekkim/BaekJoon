package BaekJoon.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 27866
 * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 */
public class CharacterAndStrings {

    public void countCharacter () throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String word = bf.readLine();
        int whichLetterToFind = Integer.parseInt(bf.readLine());
        // 0 1 2 3 4 5
        // S p r o u t
        // 3 번째를 찾으세요
        // 2번째를 찾으면 됨.

        int startNumber = 0;
        int endNumber = whichLetterToFind;
        if(whichLetterToFind - 1 < 1) {
            startNumber = 0 ;
        } else {
            startNumber = whichLetterToFind - 1 ;
        }
        String whichLetter = word.substring(startNumber , endNumber);
        System.out.println(whichLetter);
    }
}

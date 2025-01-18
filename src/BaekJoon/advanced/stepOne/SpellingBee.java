package BaekJoon.advanced.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 1157
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
public class SpellingBee {

    public void letsFindTheMostUsedLetter() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine().toUpperCase();
        bf.close();

        int[] allLetters = new int[26];

        for (int i = 0 ; i < word.length() ; i++) {
            int number = word.charAt(i);
            int letter = number - 65;
            allLetters[letter] += 1;
        }

        int largest = 0;
        String result = "?";
        boolean duplicatedLargestNumber = false;

        for(int i = 0 ; i < 26; i++) {
//            char number = (char)(i + 65);
//            System.out.println("누가 들어갔니? " + allLetters[i] + " i = ?" + i + " 문자는 = ?" + number);

            if (allLetters[i] > largest) {
                largest = allLetters[i];
            }

        }

//        System.out.println("제일 큰 숫자: " + largest);
        int largestCount = 0;
        char letterI = 'A';

        for(int i = 0; i < 26 ; i++) {
            if(allLetters[i] == largest) {
                largestCount += 1;
                letterI = (char) (i+65);
            }

            if(largestCount > 1) {
                duplicatedLargestNumber = true;
                break;
            }
        }

        if(duplicatedLargestNumber) {
            System.out.println(result);
        } else {
            System.out.println(letterI);
        }


    }
}

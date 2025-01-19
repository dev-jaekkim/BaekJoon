package BaekJoon.stepByStep.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 2941
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * <p>
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 */
public class CroatiaAlphabet {

    public void howManyLetters() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        bf.close();

        // c= , c- , dz=, d-, lj, nj, s=, z=
        // word charAt(i) == c , d, l, n , s, 체크
        // 만약 일치한다면 다음 글자가 c 일 경우 = , -
        // d 일 경우 -
        // d 인 경우 z 다음이 = 인경우
        // l, n 인 경우 j
        // s, z 인 경우 =

        int totalLetterCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(i + "번째 : " + "totalLetterCount = " + totalLetterCount + " 확인하는 단어 : " + word.charAt(i));

            switch (letter) {
                case 'c':
                    if ((i + 1) < word.length() && word.charAt(i + 1) == '=') {
                        totalLetterCount += 1;
                        i += 1;
                        continue;
                    }
                    if ((i + 1) < word.length() && word.charAt(i + 1) == '-') {
                        totalLetterCount += 1;
                        i += 1;
                        continue;
                    }
                    totalLetterCount += 1;
                    break;
                case 'd':
                    if ((i + 2) < word.length() && word.charAt(i + 1) == 'z' && word.charAt(i + 2) == '=') {
                        totalLetterCount += 1;
                        i += 2;
                        continue;
                    }
                    if ((i + 1) < word.length() && word.charAt(i + 1) == '-') {
                        totalLetterCount += 1;
                        i += 1;
                        continue;
                    }
                    totalLetterCount += 1;
                    break;
                case 'l':
                case 'n':
                    if ((i + 1) < word.length() && word.charAt(i + 1) == 'j') {
                        totalLetterCount += 1;
                        i += 1;
                        continue;
                    }
                    totalLetterCount += 1;
                    break;
                case 's':
                case 'z':
                    if ((i + 1) < word.length() && word.charAt(i + 1) == '=') {
                        totalLetterCount += 1;
                        i += 1;
                        continue;
                    }
                    totalLetterCount += 1;
                    break;
                default:
                    totalLetterCount += 1;
                    break;
            }

        }

        System.out.println(totalLetterCount);

    }

    public void smarterWay() throws Exception {
        String[] crotiaAlphabet = {"c=" , "c-" , "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        bf.close();

        for(int i = 0 ; i < word.length() ; i++) {
            if(word.contains(crotiaAlphabet[i])) {
                word.replace(crotiaAlphabet[i],"a");
            }
        }
        System.out.println(word.length());
    }
}

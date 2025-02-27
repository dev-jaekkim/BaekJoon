package BaekJoon.stepByStep.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 5622
 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
 * 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 *
 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며,
 * 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 *
 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때,
 * 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
 *
 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 *
 * 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 */
public class RingTheDial {

    public void printTheMinimumTime() throws Exception {
        // 1
        // ABC - 3, DEF - 4 , GHI - 5 , JKL - 6, MNO - 7
        // PQRS - 8 , TUV - 9, WXYZ - 10,
        // 0

        // W A
        // 10 + 3 = 13 초

        // UNUCIC

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String dialNumbers = bf.readLine();
        bf.close();
        int totalTimeCount = 0;

        for(int i = 0 ; i <dialNumbers.length() ; i++) {
            char c = dialNumbers.charAt(i);
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    totalTimeCount += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    totalTimeCount += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    totalTimeCount += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    totalTimeCount += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    totalTimeCount += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    totalTimeCount += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    totalTimeCount += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    totalTimeCount += 10;
                    break;
            }
        }

        System.out.println(totalTimeCount);
    }
}

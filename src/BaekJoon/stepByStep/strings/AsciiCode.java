package BaekJoon.stepByStep.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 11654
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
public class AsciiCode {
    public void printTheCode() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int code = bf.readLine().charAt(0);
        bf.close();
        System.out.println(code);
    }
}

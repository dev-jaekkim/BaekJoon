package BaekJoon.solved.ac.classes.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 31403
 * JavaScript에서 $+, -$은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다.
 * 하지만 문자열에 대해서 $+$는 두 문자열을 이어붙이라는 의미이고,
 * $-$는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
 *
 *  $A, B, C$를 각각 수와 문자열로 생각했을 때 $A+B-C$를 출력하세요.
 */
public class LetsSum {

    public void sumDifferentCases () throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        System.out.println((a+b-c));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);

        int ab = Integer.parseInt(sb.toString());
        System.out.println(ab - c);

    }
}

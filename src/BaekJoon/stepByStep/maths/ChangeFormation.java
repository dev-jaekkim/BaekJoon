package BaekJoon.stepByStep.maths;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 2745
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 * <p>
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다.
 * 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 * <p>
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */
public class ChangeFormation {

    public void calculateFormation() throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(input, " ");
        String number = st.nextToken();
        int formationNum = Integer.parseInt(st.nextToken());
        double finalValue = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);//
            System.out.println("c = " + c);

            int num = number.charAt(i); // A 97

            System.out.println("num : " + num);

            if (num >= 65) {
                num = num - 55;
            } else {
                num = num - 48;
            }
            System.out.println("num : " + num);


            if (i != 0) {
                double numValue = Math.pow(formationNum, i);
                System.out.println("Math.pow() : " + formationNum + " " + i);
                System.out.println("numValue : " + numValue);
                finalValue += numValue * num;
            } else {
                finalValue += num;
            }
        }

        System.out.printf("%.0f\n", finalValue);

    }

    public void clever() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(input, " ");
        String number = st.nextToken();
        int formationNum = Integer.parseInt(st.nextToken());
        int finalValue = 0;
        int temp = 1;

        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                finalValue += (c-55) * temp;
            } else {
                finalValue += (c-48) * temp;
            }

            temp *= formationNum;
        }

        System.out.print(finalValue);
    }
}

package BaekJoon.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 11720
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 */
public class SumOfNumbers {
    public void howFarCanYouSum () throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalCount = Integer.parseInt(bf.readLine());
        String totalNumber = bf.readLine();
        bf.close();
        int totalSum = 0;

        for (int i = 0 ; i <totalCount ; i++) {
            char nextNumber = totalNumber.charAt(i);
            totalSum += Character.getNumericValue(nextNumber);
        }

        System.out.println(totalSum);
    }
}

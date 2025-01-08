package BaekJoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 10818
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class SmallestBiggest {

    public void printTheBiggestAndTheSmallest() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(bf.readLine());

        int smallest = 0;
        int biggest = 0;

        StringBuilder sb = new StringBuilder();

        String nextLine = bf.readLine();
        StringTokenizer st = new StringTokenizer(nextLine, " ");
        bf.close();

        for (int i = 0 ; i < count; i++) {
            int nextNumber = Integer.parseInt(st.nextToken());

            if (i == 0) {
                smallest = nextNumber;
                biggest = nextNumber;
                continue;
            }

            if (nextNumber < smallest) {
                smallest = nextNumber;
                continue;
            }

            if (nextNumber > biggest) {
                biggest = nextNumber;
            }

        }

        sb.append(smallest);
        sb.append(" ");
        sb.append(biggest);
        System.out.println(sb);
    }

}

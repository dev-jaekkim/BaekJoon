package BaekJoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 10810
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
 * 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
 * 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
 *
 * 도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때,
 * 공을 넣을 바구니 범위를 정하고, 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
 * 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다.
 * 공을 넣을 바구니는 연속되어 있어야 한다.
 *
 * 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 * 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다.
 * 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
 * 도현이는 입력으로 주어진 순서대로 공을 넣는다.
 *
 * 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
 */
public class BallsInTheHouse {

    public void howManyBalls () throws Exception {
        // N(바구니 개수) , M (공 넣는 횟수)
        // 5개의 바구나, 4번 공을 넣는다.
        //  1 2 3 1번 바구니부터 2번바구니까지 3번 번호 적힌 공을 넣는다.
        // 3 4 4 3번 바구니부터 4번바구니까지 4번 번호를 넣는다.
        // 1 4 1 1번 바구니부터 4번 바구니까지 1번 번호를 넣는다.
        // 2 2 2  2번 바구니부터 2번 바구니까지 2번 번호를 넣는다.

        // 1 2 3 4 5
        // (1) (2) (1) (1) (0)
        // 바구니 속 공 번호 출력

        // 총 바구니 수 구하기
        // 총 입력 라인

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int totalBasket = Integer.parseInt(st.nextToken());
        int totalInput = Integer.parseInt(st.nextToken());

        int[] finalBasket = new int[totalBasket];

        for (int j = 1 ; j <= totalInput; j++) {
            String oneLine = bf.readLine();
            StringTokenizer st1 = new StringTokenizer(oneLine, " ");
            int firstBasket = Integer.parseInt(st1.nextToken());
            int lastBasket = Integer.parseInt(st1.nextToken());
            int ballNumber = Integer.parseInt(st1.nextToken());
            for (int i = firstBasket ; i <= lastBasket ; i ++) {
                finalBasket[i-1] = ballNumber;
            }
        }

        bf.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < totalBasket ; i++) {
            sb.append(finalBasket[i]);
            sb.append(" ");
        }

        System.out.println(sb);

    }
}
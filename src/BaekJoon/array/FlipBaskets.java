package BaekJoon.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 10811
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 순서대로 적혀져 있다.
 * 바구니는 일렬로 놓여져 있고, 가장 왼쪽 바구니를 1번째 바구니, 그 다음 바구니를 2번째 바구니, ...,
 * 가장 오른쪽 바구니를 N번째 바구니라고 부른다.
 *
 * 도현이는 앞으로 M번 바구니의 순서를 역순으로 만들려고 한다. 도현이는 한 번 순서를 역순으로 바꿀 때,
 * 순서를 역순으로 만들 범위를 정하고, 그 범위에 들어있는 바구니의 순서를 역순으로 만든다.
 *
 * 바구니의 순서를 어떻게 바꿀지 주어졌을 때, M번 바구니의 순서를 역순으로 만든 다음,
 * 바구니에 적혀있는 번호를 가장 왼쪽 바구니부터 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 *
 * 둘째 줄부터 M개의 줄에는 바구니의 순서를 역순으로 만드는 방법이 주어진다.
 * 방법은 i j로 나타내고, 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순으로 만든다는 뜻이다. (1 ≤ i ≤ j ≤ N)
 *
 * 도현이는 입력으로 주어진 순서대로 바구니의 순서를 바꾼다.
 *
 * 모든 순서를 바꾼 다음에, 가장 왼쪽에 있는 바구니부터 바구니에 적혀있는 순서를 공백으로 구분해 출력한다.
 */
public class FlipBaskets {

    public void printBasketsFromLeft() throws Exception {
        // 5 4
        // 1 2 3 4 5
        // 1 2
        // 2 1 3 4 5
        // 3 4
        // 2 1 4 3 5 (문제 발생)
        // 1 4
        // 3 4 1 2 5
        // 2 2
        // 3 4 1 2 5

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int totalBaskets = Integer.parseInt(st.nextToken());
        int totalInput = Integer.parseInt(st.nextToken());

        int[] baskets = new int[totalBaskets];

        for(int i = 0 ; i < totalBaskets ; i++) {
            baskets[i] = i+1;
            System.out.println("처음 세팅 : basket "+ (i+1) + "번 :" + baskets[i]);
        }

        // total input 기준에 따라서 순서가 마구 뒤ㅂ바뀔것이여

        for (int i = 0 ; i < totalInput ; i ++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int firstBasket = Integer.parseInt(st2.nextToken());
            int lastBasket = Integer.parseInt(st2.nextToken());

            System.out.println("교환 전 : basket "+ (firstBasket - 1) + "번 :" + baskets[firstBasket - 1]);
            System.out.println("교환 전 : basket "+ (lastBasket - 1) + "번 :" + baskets[lastBasket - 1]);

            int temp1 = baskets[firstBasket - 1];
            baskets[firstBasket - 1] = baskets[lastBasket - 1];
            baskets[lastBasket- 1] = temp1;
            System.out.println("교환 후 : basket "+ (firstBasket - 1) + "번 :" + baskets[firstBasket - 1]);
            System.out.println("교환 후 : basket "+ (lastBasket - 1) + "번 :" + baskets[lastBasket - 1]);

            System.out.println("firstBasket = " + firstBasket + " lastBasket = " + lastBasket);
            int remainingCount = lastBasket - firstBasket - 1; // 4 - 1 - 1 = 2

            if(remainingCount > 0 ) {
                System.out.println("remainingCount : " + remainingCount);
                remainingCount = remainingCount / 2;
                firstBasket += 1;
                lastBasket -= 1;
                System.out.println("remainingCount after division 2 : " + remainingCount);
                System.out.println("firstBasket : " + firstBasket);
                System.out.println("lastBasket : " + lastBasket);

                for (int j = 0 ; j < remainingCount ; j++) { // 1
                    int temp = baskets[firstBasket - 1];
                    baskets[firstBasket - 1] = baskets[lastBasket - 1];
                    baskets[lastBasket- 1] = temp;
                    firstBasket += 1;
                    lastBasket -= 1;
                }

            }

            for(int k = 0 ; k < totalBaskets; k++) {
                System.out.println("swap 후 : basket "+ k + "번 :" + baskets[k]);
            }
        }

        bf.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < totalBaskets ; i++){
            sb.append(baskets[i]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}

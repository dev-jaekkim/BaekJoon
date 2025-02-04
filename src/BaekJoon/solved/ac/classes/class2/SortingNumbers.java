package BaekJoon.solved.ac.classes.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 백준 10989
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
 * 이 수는 10,000보다 작거나 같은 자연수이다.
 *
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 */
public class SortingNumbers {

    public void howShallISort() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(bf.readLine());

        List<Integer> numbersToSort = new ArrayList<Integer>();

        for(int i = 0 ; i < totalNumbers ; i++) {
            numbersToSort.add(Integer.parseInt(bf.readLine()));
        }

        numbersToSort.sort(Comparator.naturalOrder());

        StringBuilder sb = new StringBuilder();
        for(Integer a : numbersToSort) {
            sb.append(a);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }

    public void arrayCreate() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(bf.readLine());
        int[] arrayToSort = new int[totalNumbers];

        for(int i = 0 ; i < totalNumbers; i++) {
            arrayToSort[i] = Integer.parseInt(bf.readLine());
        }

        // 배열에 다 들어옴
        // 이중 for 문 필요 왜냐면 전부 다 비교해야함.

        for(int i = 0 ; i < totalNumbers ; i ++) {
            int temp = arrayToSort[i];
            for (int j = 1 ; j < totalNumbers - 1 ; j++) {
                if(arrayToSort[i] > arrayToSort[j]) {
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                    break;
                }
            }

            if(i == totalNumbers - 1) {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a : arrayToSort) {
            sb.append(a);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }



}

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
        int[] countingSort = new int[10001];
        int[] result = new int[totalNumbers];

        for(int i = 0 ; i < totalNumbers; i++) {
            int value = Integer.parseInt(bf.readLine());
            arrayToSort[i] = value;
            countingSort[value]++;
        }
        // 배열과 counting 배열 모두 값을 넣음
        // 10 5 2 3 1 4 2 3 5 1 7
        // 0 1 2 3 4 5 6 7 8 9

        for(int i = 0 ; i < 10001; i++) {
            if(i != 10000){
                countingSort[i+1] = countingSort[i+1] + countingSort[i];
            }
        }
        // total Number 10
        // 0 1 2 3 4 5 6 7 8 9
        // 배열 넣기
        for(int i = totalNumbers - 1 ; i >= 0 ; i--) {
            int location = arrayToSort[i];
            countingSort[location]--;
            result[countingSort[location]] = location;
        }

        StringBuilder sb = new StringBuilder();
        for(int a : result) {
            sb.append(a);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    public void blogSolution() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(bf.readLine());
        int[] arrayToSort = new int[totalNumbers];
        int[] countingSort = new int[10001];
        int[] result = new int[totalNumbers];

        // 정렬 값 counting 정렬 안에 넣어주기
        for(int i = 0 ; i < totalNumbers; i++) {
            int value = Integer.parseInt(bf.readLine());
            arrayToSort[i] = value;
            countingSort[arrayToSort[i]]++;
        }

        // counting 배열 누적합 구하기
        for(int i = 1; i < countingSort.length; i++) {
            countingSort[i] += countingSort[i-1];
        }

        // 최종 결과값 세팅
        for(int i = result.length - 1 ; i >= 0 ; i--) {
            int value = arrayToSort[i];
            countingSort[value]--;
            result[countingSort[value]] = value;
        }

        StringBuilder resultString = new StringBuilder();
        for(int value : result) {
            resultString.append(value);
            resultString.append(System.lineSeparator());
        }

        System.out.println(resultString);
    }

}

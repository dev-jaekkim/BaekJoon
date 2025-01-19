package BaekJoon.stepByStep.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 1546
 * 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
 * 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
 *
 * 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
 *
 * 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다.
 * 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
 *
 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.
 */
public class Average {

    public void newAverage() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalSubjectCount = Integer.parseInt(bf.readLine());

        double[] subjectScores = new double[totalSubjectCount];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        double topScore = 0;

        // 값 세팅 및 최고 값 구하기 완료
        for(int i = 0 ; i < totalSubjectCount ; i++) {
            subjectScores[i] = Integer.parseInt(st.nextToken());
            System.out.println("subjectScore "+ i + "번 :" + subjectScores[i]);
            if(subjectScores[i] > topScore) {
                topScore = subjectScores[i];
                System.out.println("topScore 변경 " + topScore);
            }
        }

        double totalSum = 0;
        // 새로운 평균 구하기
        for (int i = 0 ; i < totalSubjectCount ; i++) {
            System.out.println("subjectScore "+ i + "번 :" + subjectScores[i]);
            // 40 / 80 * 100
            System.out.println("연산 전 최종 더하기 :" + totalSum);
            totalSum += subjectScores[i]/topScore*100;
        }

        System.out.println("나누기 값" + totalSum);
        double finalValue = totalSum / totalSubjectCount;

        System.out.println(finalValue);
    }
}

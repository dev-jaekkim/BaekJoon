package BaekJoon.solved.ac.classes.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 백준 8958
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * <p>
 * <p>
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * <p>
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
public class Quiz {

    public void giveMeTheScore() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalInput = Integer.parseInt(bf.readLine());
        int correctScore = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalInput; i++) {
            String quizMark = bf.readLine();

            int quizTotalScore = 0;
            for (int j = 0; j < quizMark.length(); j++) {
                if (quizMark.charAt(j) == 'O') {
//                    System.out.println("O 일때 correctScore" + correctScore);
                    quizTotalScore += correctScore;
//                    System.out.println("O 일때 quizTotalScore" + quizTotalScore);
                    correctScore++;
                }
                if (quizMark.charAt(j) == 'X') {
//                    System.out.println("X 일때 quizTotalScore" + quizTotalScore);
                    correctScore = 1;
//                    System.out.println("X 일때 correctScore" + correctScore);
                }
            }
            correctScore = 1;
//            System.out.println("최종 저장 값 : quizTotalScore = " + quizTotalScore + " correctScore = " + correctScore);
            sb.append(quizTotalScore);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);

    }

    public void slightModification() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalInput = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalInput; i++) {
            String quizMark = bf.readLine();
            int correctScore = 1;
            int quizTotalScore = 0;

            for (int j = 0; j < quizMark.length(); j++) {
                if (quizMark.charAt(j) == 'O') {
                    quizTotalScore += correctScore;
                    correctScore++;
                }
                if (quizMark.charAt(j) == 'X') {
                    correctScore = 1;
                }
            }
            sb.append(quizTotalScore);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}

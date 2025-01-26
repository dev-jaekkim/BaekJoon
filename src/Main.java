import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalInput = Integer.parseInt(bf.readLine());
        int correctScore = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalInput; i++) {
            String quizMark = bf.readLine();

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
            correctScore = 1;
            sb.append(quizTotalScore);
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}

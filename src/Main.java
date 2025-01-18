import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] subjects = new String[20];
        Double[] credits = new Double[20];
        String[] actualScore = new String[20];
        Double[] scores = new Double[20];
        int totalSubject = 20;
        double totalCredit = 0.0;

        String[] scoreBoard = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};

        double averageScore = 0.0;

        for (int i = 0; i < 20; i++) {
            String line = bf.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            subjects[i] = st.nextToken();
            credits[i] = Double.parseDouble(st.nextToken());
            actualScore[i] = st.nextToken();
            switch (actualScore[i]) {
                case "A+":
                    scores[i] = 4.5;
                    break;
                case "A0":
                    scores[i] = 4.0;
                    break;
                case "B+":
                    scores[i] = 3.5;
                    break;
                case "B0":
                    scores[i] = 3.0;
                    break;
                case "C+":
                    scores[i] = 2.5;
                    break;
                case "C0":
                    scores[i] = 2.0;
                    break;
                case "D+":
                    scores[i] = 1.5;
                    break;
                case "D0":
                    scores[i] = 1.0;
                    break;
                case "F":
                case "P":
                    scores[i] = 0.0;
                    break;
            }
            if (!"P".equals(actualScore[i])) {
                averageScore += credits[i] * scores[i];
                totalCredit += credits[i];
            } else {
                totalSubject--;
            }
        }
        bf.close();
        System.out.println(averageScore / totalCredit);
    }
}

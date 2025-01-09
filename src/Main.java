import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalSubjectCount = Integer.parseInt(bf.readLine());

        double[] subjectScores = new double[totalSubjectCount];

        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        double topScore = 0;

        for(int i = 0 ; i < totalSubjectCount ; i++) {
            subjectScores[i] = Integer.parseInt(st.nextToken());
            if(subjectScores[i] > topScore) {
                topScore = subjectScores[i];
            }
        }

        double totalSum = 0;
        for (int i = 0 ; i < totalSubjectCount ; i++) {
            totalSum += subjectScores[i]/topScore*100;
        }

        double finalValue = totalSum / totalSubjectCount;

        System.out.println(finalValue);
    }
}

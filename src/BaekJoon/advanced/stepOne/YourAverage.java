package BaekJoon.advanced.stepOne;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 백준 25206
 * 인하대학교 컴퓨터공학과를 졸업하기 위해서는, 전공평점이 3.3 이상이거나 졸업고사를 통과해야 한다.
 * 그런데 아뿔싸, 치훈이는 깜빡하고 졸업고사를 응시하지 않았다는 사실을 깨달았다!
 * <p>
 * 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
 * <p>
 * 전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
 * <p>
 * 인하대학교 컴퓨터공학과의 등급에 따른 과목평점은 다음 표와 같다.
 * <p>
 * A+	4.5
 * A0	4.0
 * B+	3.5
 * B0	3.0
 * C+	2.5
 * C0	2.0
 * D+	1.5
 * D0	1.0
 * F	0.0
 * <p>
 * P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
 * <p>
 * 과연 치훈이는 무사히 졸업할 수 있을까?
 * 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
 */
public class YourAverage {

    public void canYouGraduate() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] subjects = new String[20];
        Double[] credits = new Double[20];
        String[] actualScore = new String[20];
        Double[] scores = new Double[20];
        int totalSubject = 20;
        double totalCredit = 0.0;

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
                System.out.println("subjects = " + subjects[i]);
                System.out.println("actualScore = " + actualScore[i]);
                System.out.println("credits = " + credits[i]);
                System.out.println("scores = " + scores[i]);
                System.out.println("합산 전 averageScore = " + averageScore);
                averageScore += credits[i] * scores[i];
                System.out.println("합산 후 averageScore = " + averageScore);
                System.out.println("합산 할 과목 수 : " + totalSubject);
                totalCredit += credits[i];
            } else {
                totalSubject--;
            }
        }
        System.out.println("averageScore = " + averageScore);
        System.out.println("totalSubject = " + totalSubject);

        bf.close();
        System.out.println(averageScore / totalCredit);
    }
}

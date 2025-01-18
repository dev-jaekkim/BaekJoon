import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int inputNumber = Integer.parseInt(bf.readLine());
        bf.close();

        int totalLine = inputNumber * 2 - 1;
        int totalBlank = totalLine / 2;
        int firstStar = 1;

        StringBuilder sb = new StringBuilder();
        boolean goingDownWards = true;

        for (int i = 0; i < totalLine; i++) {

            if (goingDownWards) {
                for (int j = 0; j < totalBlank; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < firstStar; k++) {
                    sb.append("*");
                }

                    totalBlank -= 1;
                    firstStar += 2;
                    sb.append(System.lineSeparator());

                if (firstStar > totalLine) {
                    totalBlank += 1;
                    firstStar -= 2;
                    goingDownWards = false;
                }
            }

            if (!goingDownWards && firstStar > 1) {
                totalBlank += 1;
                firstStar -= 2;

                for (int j = 0; j < totalBlank; j++) {
                    sb.append(" ");
                }
                for (int k = 0; k < firstStar; k++) {
                    sb.append("*");
                }

                if(firstStar > 1){
                    sb.append(System.lineSeparator());
                }

            }
        }
        System.out.print(sb);
    }
}

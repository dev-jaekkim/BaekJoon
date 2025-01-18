import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        char[][] totalMatrix = new char[15][15];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String firstLine = bf.readLine();

            for (int j = 0; j < firstLine.length(); j++) {
                totalMatrix[i][j] = firstLine.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (totalMatrix[j][i] != 0) {
                    sb.append(totalMatrix[j][i]);
                }
            }
        }

        System.out.println(sb);
        bf.close();
    }
}

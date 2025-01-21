import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalCount = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalCount; i++) {
            int level = Integer.parseInt(bf.readLine());
            int roomNumber = Integer.parseInt(bf.readLine());
            int[][] apartment = new int[level + 1][roomNumber + 1];

            for (int j = 0; j < level + 1; j++) {
                for (int k = 1; k < roomNumber + 1; k++) {
                    if (j == 0) {
                        apartment[j][k] = k;
                    } else {
                        apartment[j][k] = apartment[j - 1][k] + apartment[j][k - 1];
                    }
                }
            }
            sb.append(apartment[level][roomNumber]);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);
        bf.close();
    }
}

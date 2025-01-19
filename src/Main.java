import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalPaper = Integer.parseInt(bf.readLine());

        boolean[][] totalArea = new boolean[101][101];
        int totalAreaCount = 0;

        for(int i = 0 ; i < totalPaper ; i++) {
            String coordination = bf.readLine();
            StringTokenizer st = new StringTokenizer(coordination, " ");

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = x; j < 10+x; j++) {
                for(int k = y ; k < 10+y; k++) {
                    totalArea[j][k] = true;
                }
            }
        }

        for(int i = 0; i < 101 ; i++) {
            for(int j = 0 ; j < 101; j++) {
                if(totalArea[i][j]) {
                    totalAreaCount +=1;
                }
            }
        }

        System.out.println(totalAreaCount);
    }
}

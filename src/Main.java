import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalCount = Integer.parseInt(bf.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i < totalCount ; i++) {
            for (int j = 1 ; j <= totalCount ; j++) {
                if(j <= totalCount - i - 1) {
                    sb.append(" ");
                } else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        bf.close();
    }

}

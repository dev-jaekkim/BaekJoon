import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String totalCountString = bf.readLine();
        int totalCount = Integer.parseInt(totalCountString);

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= totalCount; i++) {
            sb.append("Case #");
            sb.append(i);
            sb.append(": ");

            //total
            String sumNumbers = bf.readLine();
            StringTokenizer st = new StringTokenizer(sumNumbers, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b);
            sb.append("\n");
        }

        System.out.println(sb);
        bf.close();
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        StringTokenizer st = new StringTokenizer(inputLine , " ");
        bf.close();
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        int day = (goal - down) / (up - down);

        if((goal - down) % (up - down) != 0) {
            day++;
        }

        System.out.println(day);
    }
}

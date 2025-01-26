import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalInput = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalInput; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int height = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int visitor = Integer.parseInt(st.nextToken());

            int floor = visitor % height == 0 ? height : visitor % height;
            int roomNumber = visitor % height == 0 ? visitor / height : visitor / height + 1;
            sb.append(floor).append(String.format("%02d", roomNumber)).append(System.lineSeparator());
        }

        System.out.println(sb);

    }
}

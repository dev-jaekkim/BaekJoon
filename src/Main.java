import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = bf.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            int ausar = Integer.parseInt(st.nextToken());
            int auset = Integer.parseInt(st.nextToken());
            int heru = Integer.parseInt(st.nextToken());

            if (ausar == 0 && auset == 0 && heru == 0) {
                break;
            }

            int[] lines = new int[3];
            lines[0]= ausar;
            lines[1] = auset;
            lines[2] = heru;

            Arrays.sort(lines);

            if (lines[2] * lines[2] == lines[0] * lines[0] + lines[1] * lines[1]) {
                sb.append("right");
            } else {
                sb.append("wrong");
            }
            sb.append(System.lineSeparator());
        }

        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int totalChange = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < totalChange; i++) {
            int nextChange = Integer.parseInt(bf.readLine());

            if(nextChange >= 25) {
                sb.append(nextChange/25);
                sb.append(" ");
                nextChange = nextChange%25;
            } else {
                sb.append(0);
                sb.append(" ");
            }

            if(nextChange >= 10) {
                sb.append(nextChange/10);
                sb.append(" ");
                nextChange = nextChange%10;
            } else {
                sb.append(0);
                sb.append(" ");
            }

            if(nextChange >= 5) {
                sb.append(nextChange/5);
                sb.append(" ");
                nextChange = nextChange%5;
            } else {
                sb.append(0);
                sb.append(" ");
            }

            sb.append(nextChange);
            sb.append(System.lineSeparator());

        }

        System.out.println(sb);
    }
}

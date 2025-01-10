import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bf.readLine();
        StringBuilder sb = new StringBuilder();

        while(Optional.ofNullable(firstLine).isPresent()) {
            sb.append(firstLine);
            sb.append(System.lineSeparator());
            firstLine = bf.readLine();
        }
        bf.close();

        System.out.println(sb);
    }
}

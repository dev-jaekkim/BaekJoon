import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        System.out.println((a+b-c));
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(b);

        int ab = Integer.parseInt(sb.toString());
        System.out.println(ab - c);
    }
}

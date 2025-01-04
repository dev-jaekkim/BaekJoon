import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String str = bf.readLine();
        String str2 = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(str, " ");

        int currentHour = Integer.parseInt(st.nextToken());
        int currentMinute = Integer.parseInt(st.nextToken());
        int cookingMinute = Integer.parseInt(str2);

        int x = currentMinute + cookingMinute;

        int addedHour = x / 60;
        int leftMinute = x % 60;

        int finalHour = (currentHour + addedHour) % 24;

        System.out.println(finalHour + " " + leftMinute);
    }

}

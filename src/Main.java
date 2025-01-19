import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int attendants = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        String sizeOfTshirtInput = bf.readLine();
        StringTokenizer st = new StringTokenizer(sizeOfTshirtInput, " ");
        int shirtResultCount = 0;


        String tshirtBundlePenBundle = bf.readLine();
        StringTokenizer st2 = new StringTokenizer(tshirtBundlePenBundle, " ");
        bf.close();
        int penResult = 0;
        int unitPenResult = 0;

        int tshirtBundle = Integer.parseInt(st2.nextToken());
        int penBundle = Integer.parseInt(st2.nextToken());

        for(int i = 0 ; i < 6; i++) {
            int sizeCount = Integer.parseInt(st.nextToken());
            shirtResultCount += sizeCount/tshirtBundle;
            if(sizeCount%tshirtBundle != 0) {
                shirtResultCount += 1;
            }

        }
        sb.append(shirtResultCount);
        sb.append(System.lineSeparator());
        penResult = attendants / penBundle;
        unitPenResult = attendants % penBundle;
        sb.append(penResult);
        sb.append(" ");
        sb.append(unitPenResult);

        System.out.println(sb);
    }
}

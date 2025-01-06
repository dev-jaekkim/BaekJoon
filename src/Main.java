import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalArrayCount = Integer.parseInt(bf.readLine());

        int[] totalArray = new int[totalArrayCount];

        String arrayString = bf.readLine();
        StringTokenizer st = new StringTokenizer(arrayString, " ");

        String foundString = bf.readLine();
        int numberToFind = Integer.parseInt(foundString);
        int findCount = 0;

        for(int i = 0 ; i < totalArrayCount ; i++) {
            totalArray[i] = Integer.parseInt(st.nextToken());
            if(totalArray[i] == numberToFind){
                findCount += 1;
            }
        }

        System.out.println(findCount);
        bf.close();
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] crotiaAlphabet = {"c=" , "c-" , "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String word = bf.readLine();
        bf.close();

        for(int i = 0 ; i < word.length() ; i++) {
            if(word.contains(crotiaAlphabet[i])) {
                word = word.replace(crotiaAlphabet[i],"a");
            }
        }
        System.out.println(word.length());


    }
}
